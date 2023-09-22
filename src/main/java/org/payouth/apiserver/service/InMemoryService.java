package org.payouth.apiserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.payouth.apiserver.model.Election;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class InMemoryService {
    private List<Election> elections;
    private final ObjectMapper objectMapper;

    public InMemoryService() throws IOException {
        objectMapper = new ObjectMapper();
        elections = objectMapper.readValue(new File("src/main/resources/data.json"), new TypeReference<List<Election>>(){});
    }

    public List<Election> getElections() {
        return elections;
    }

    public List<Election> loadFromJson(String json) throws JsonProcessingException {
        elections = objectMapper.readValue(json, new TypeReference<List<Election>>(){});
        return elections;
    }

    public String getElectionsAsJson() throws JsonProcessingException {
        return objectMapper.writeValueAsString(elections);
    }

    public Optional<Election> getElection(String electionId) {
        return getElections().stream().filter(election -> election.getId().equals(electionId)).findAny();
    }

    public Election createElection(Election request) {
        getElections().add(request);
        return request;
    }

    public void deleteElection(String electionId) {
        elections.removeIf(election -> election.getId().equals(electionId));
    }




}
