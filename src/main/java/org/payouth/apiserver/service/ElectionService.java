package org.payouth.apiserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.payouth.apiserver.model.Comment;
import org.payouth.apiserver.model.Election;
import org.payouth.apiserver.model.ElectionStage;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

public interface ElectionService {

    List<Election> getElections();

    List<Election> loadFromJson(String json) throws JsonProcessingException;

    String getElectionsAsJson() throws JsonProcessingException;

    Optional<Election> getElection(String electionId);

    Election createElection(Election request);

    void deleteElection(String electionId);

    default List<ElectionStage> getElectionStages(String electionId) {
        return getElection(electionId)
                .orElseThrow(() -> new NotFoundException("electionId="+electionId+" is not found."))
                .getStages();
    }

    default Optional<ElectionStage> getElectionStage(String electionId, String stageId) {
        return getElectionStages(electionId).stream().filter(stage -> stage.getId().equals(stageId)).findAny();
    }

    ElectionStage createElectionStage(String electionId, ElectionStage electionStage);

    void deleteElectionStage(String electionId, String stageId);

    default List<Comment> getAllCommentsInElection(String electionId) {
        return getElection(electionId)
                .orElseThrow(() -> new NotFoundException("electionId="+electionId+" is not found."))
                .getComments();
    }

    default List<Comment> getAllCommentsInStage(String electionId, String stageId) {
        return getElectionStage(electionId,stageId)
                .orElseThrow(() -> new NotFoundException("stageId="+stageId+" and electionId="+electionId+" is not found."))
                .getComments();
    }

    Comment postCommentInElection(String electionId, Comment comment);

    Comment postCommentInStage(String electionId, String stageId, Comment comment);
}
