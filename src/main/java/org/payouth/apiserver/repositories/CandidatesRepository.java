package org.payouth.apiserver.repositories;

import org.payouth.apiserver.model.Candidate;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface CandidatesRepository extends CrudRepository<Candidate, String> {
    Optional<Candidate> findById(String id);
}
