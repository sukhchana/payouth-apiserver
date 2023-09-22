package org.payouth.apiserver.service.impl;

import org.payouth.apiserver.model.User;
import org.payouth.apiserver.repositories.UserRepository;
import org.payouth.apiserver.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User createUser(User user) {
        Optional<User> existed = repository.findByEmail(user.getEmail());
        if(existed.isPresent()){
             throw new RuntimeException("User with email: "+user.getEmail()+" already exists");
        }
        return repository.save(user);
    }

    @Override
    public void deleteUser(String email) {
        User user = repository.findByEmail(email).orElseThrow();
        repository.delete(user);
    }

    @Override
    public List<User> filterUsers(Integer birthYear, String gender) {
        return repository.findByDateOfBirthAndGender(birthYear,gender);
    }

    @Override
    public User getUserByEmail(String email) {
        return repository.findByEmail(email).orElseThrow();
    }

    @Override
    public void updateUser(String email, User user) {
        User current = repository.findByEmail(email).orElseThrow();
        BeanUtils.copyProperties(current,user);
        repository.save(current);
    }
}
