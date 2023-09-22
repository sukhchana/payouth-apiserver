package org.payouth.apiserver.repositories;

import org.payouth.apiserver.model.Election;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface ElectionsRepository extends CrudRepository<Election, String> {
    Optional<Election> findById(String id);
}
