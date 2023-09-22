package org.payouth.apiserver.service;

import org.payouth.apiserver.model.User;

import java.util.List;

public interface UserService {

    public User createUser(User user) ;

    public void deleteUser(String email);

    public List<User> filterUsers(Integer birthYear, String gender) ;

    public User getUserByEmail(String email) ;

    public void updateUser(String email, User user);
}
