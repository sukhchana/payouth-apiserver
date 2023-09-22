package org.payouth.apiserver.repositories;

import org.payouth.apiserver.model.User;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@EnableScan
public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByEmail(String email);

    List<User> findByDateOfBirthAndGender(Integer birthYear, String gender);
}
