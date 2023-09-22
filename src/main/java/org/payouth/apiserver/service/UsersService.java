package org.payouth.apiserver.service;

import org.payouth.apiserver.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {


    public ResponseEntity<User> createUser(User user) {
        return null;
    }

    public ResponseEntity<List<User>> filterUsers(Integer birthYear, String gender) {
        return null;
    }
}
