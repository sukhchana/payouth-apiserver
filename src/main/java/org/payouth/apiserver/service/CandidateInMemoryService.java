package org.payouth.apiserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.payouth.apiserver.model.Candidate;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class CandidateInMemoryService implements CandidateService {
    private List<Candidate> candidates;
    private final ObjectMapper objectMapper;

    public CandidateInMemoryService() throws IOException {
        objectMapper = new ObjectMapper();
        candidates = objectMapper.readValue(new File("src/main/resources/candidate.json"), new TypeReference<List<Candidate>>(){});
    }
    @Override
    public List<Candidate> getCandidates() {
        return candidates;
    }

    @Override
    public List<Candidate> loadFromJson(String json) throws JsonProcessingException {
        candidates = objectMapper.readValue(json, new TypeReference<List<Candidate>>(){});
        return candidates;
    }

    @Override
    public String getCandidatesAsJson() throws JsonProcessingException {
        return objectMapper.writeValueAsString(candidates);
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
