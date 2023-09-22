package org.payouth.apiserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.payouth.apiserver.model.Candidate;

import java.util.List;
import java.util.Optional;

public interface CandidateService {

    List<Candidate> getCandidates();

    List<Candidate> loadFromJson(String json) throws JsonProcessingException;

    String getCandidatesAsJson() throws JsonProcessingException;

    Optional<Candidate> getCandidate(String candidateId);

    Candidate addCandidate(Candidate request);
}
