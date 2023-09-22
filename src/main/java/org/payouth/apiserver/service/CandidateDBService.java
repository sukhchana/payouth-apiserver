package org.payouth.apiserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.payouth.apiserver.model.Candidate;
import org.payouth.apiserver.repositories.CandidatesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CandidateDBService implements CandidateService {
    private final ObjectMapper objectMapper;
    private final CandidatesRepository candidatesRepository;

    public CandidateDBService(CandidatesRepository candidatesRepository) {
        this.candidatesRepository = candidatesRepository;
        objectMapper = new ObjectMapper();
    }
    @Override
    public List<Candidate> getCandidates() {
        List<Candidate> candidates = new ArrayList<>();
        candidatesRepository.findAll().forEach(candidates::add);
        return candidates;
    }

    public List<Candidate> postCandidates(List<Candidate> candidates) {
        candidatesRepository.saveAll(candidates);
        return candidates;
    }

    @Override
    public List<Candidate> loadFromJson(String json) throws JsonProcessingException {
        return postCandidates(objectMapper.readValue(json, new TypeReference<List<Candidate>>(){}));
    }

    @Override
    public String getCandidatesAsJson() throws JsonProcessingException {
        return objectMapper.writeValueAsString(getCandidates());
    }

    @Override
    public Optional<Candidate> getCandidate(String candidateId) {
        return getCandidates().stream().filter(candidate -> candidate.getId().equals(candidateId)).findAny();
    }

    @Override
    public Candidate addCandidate(Candidate request) {
        getCandidates().add(request);
        return request;
    }
}
