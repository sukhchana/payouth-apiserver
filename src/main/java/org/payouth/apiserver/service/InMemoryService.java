package org.payouth.apiserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.payouth.apiserver.model.Election;
import org.payouth.apiserver.model.ElectionStage;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

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

    public List<ElectionStage> getElectionStages(String electionId) {
        return getElection(electionId)
                .orElseThrow(() -> new NotFoundException("electionId="+electionId+" is not found."))
                .getStages();
    }

    public ElectionStage createElectionStage(String electionId, ElectionStage electionStage) {
        getElectionStages(electionId).add(electionStage);
        return electionStage;
    }

    public void deleteElectionStage(String electionId, String stageId) {
        getElectionStages(electionId).removeIf(electionStage -> electionStage.getId().equals(stageId));
    }








}
