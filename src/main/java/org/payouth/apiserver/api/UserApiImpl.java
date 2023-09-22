package org.payouth.apiserver.api;

import lombok.AllArgsConstructor;
import org.payouth.apiserver.api.interfaces.UserApi;
import org.payouth.apiserver.model.User;
import org.payouth.apiserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin()
@AllArgsConstructor
public class UserApiImpl implements UserApi {
    @Autowired
    private UserService service;
    @Override
    public ResponseEntity<User> createUser(User user) {
        return ResponseEntity.ok(service.createUser(user));
    }

    @Override
    public ResponseEntity<Void> deleteUser(String email) {
        service.deleteUser(email);
        return ResponseEntity.noContent().build();
    }


    @Override
    public ResponseEntity<User> getUserByEmail(String email) {
        return ResponseEntity.ok(service.getUserByEmail(email));
    }

    @Override
    public ResponseEntity<Void> updateUser(String email, User user) {
        service.updateUser(email,user);
        return ResponseEntity.noContent().build();
    }
}
