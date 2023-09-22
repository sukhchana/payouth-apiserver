package org.payouth.apiserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.payouth.apiserver.model.Comment;
import org.payouth.apiserver.model.Election;
import org.payouth.apiserver.model.ElectionStage;
import org.payouth.apiserver.repositories.ElectionsRepository;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ElectionsDBService implements ElectionService {

    private ElectionsRepository electionsRepo;
    private ObjectMapper objectMapper;

    public List<Election> getElections() {
        List<Election> elections = new ArrayList<>();
        electionsRepo.findAll().forEach(elections::add);
        return elections;
    }

    public List<Election> putElections(List<Election> elections) {
        electionsRepo.saveAll(elections);
        return elections;
    }

    public List<Election> loadFromJson(String json) throws JsonProcessingException {
        return putElections(objectMapper.readValue(json, new TypeReference<List<Election>>(){}));
    }

    @Override
    public String getElectionsAsJson() throws JsonProcessingException {
        return objectMapper.writeValueAsString(getElections());
    }

    @Override
    public Optional<Election> getElection(String electionId) {
        return getElections().stream().filter(election -> election.getId().equals(electionId)).findAny();
    }

    @Override
    public Election createElection(Election request) {
        electionsRepo.saveAll(Arrays.asList(request));
        return request;
    }

    @Override
    public void deleteElection(String electionId) {
        electionsRepo.deleteById(electionId);
    }

    @Override
    public ElectionStage createElectionStage(String electionId, ElectionStage electionStage) {
        Election election = getElection(electionId)
                .orElseThrow(() -> new NotFoundException("electionId="+electionId+" is not found."));
        election.addStagesItem(electionStage);
        electionsRepo.saveAll(Arrays.asList(election));
        return electionStage;

    }

    @Override
    public void deleteElectionStage(String electionId, String stageId) {

    }

    @Override
    public Comment postCommentInElection(String electionId, Comment comment) {
        Election election = getElection(electionId)
                .orElseThrow(() -> new NotFoundException("electionId="+electionId+" is not found."));
        election.addCommentsItem(comment);
        electionsRepo.saveAll(Arrays.asList(election));
        return comment;
    }

    @Override
    public Comment postCommentInStage(String electionId, String stageId, Comment comment) {
        Election election = getElection(electionId)
                .orElseThrow(() -> new NotFoundException("electionId="+electionId+" is not found."));
        var stage = election.getStages().stream().filter(electionStage -> electionStage.getId().equals(stageId)).findAny()
                .orElseThrow(() -> new NotFoundException("electionId="+electionId+" is not found."));

        stage.getComments().add(comment);
        electionsRepo.saveAll(Arrays.asList(election));
        return comment;
    }


}