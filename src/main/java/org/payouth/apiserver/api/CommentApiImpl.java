package org.payouth.apiserver.api;

import lombok.AllArgsConstructor;
import org.payouth.apiserver.api.interfaces.CommentsApi;
import org.payouth.apiserver.model.Comment;
import org.payouth.apiserver.service.ElectionsInMemoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.webjars.NotFoundException;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin()
public class CommentApiImpl implements CommentsApi {
    private ElectionsInMemoryService electionsCache;

    /**
     * GET /elections/{electionId}/comments : Get all comment for Election
     *
     * @param electionId Election ID (required)
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<List<Comment>> getAllCommentsInElection(String electionId) {
        try {
            return ResponseEntity.ok(electionsCache.getAllCommentsInElection(electionId));
        }
        catch (NotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * GET /elections/{electionId}/stages/{stageId}/comments : Get all comment for Stage
     *
     * @param electionId Election ID (required)
     * @param stageId    Election ID (required)
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<List<Comment>> getAllCommentsInStage(String electionId, String stageId) {
        try {
            return ResponseEntity.ok(electionsCache.getAllCommentsInStage(electionId, stageId));
        }
        catch (NotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * POST /elections/{electionId}/comments : Add a new comment for Election
     *
     * @param electionId Election ID (required)
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<Comment> postCommentInElection(String electionId, Comment comment) {
        try {
            return ResponseEntity.ok(electionsCache.postCommentInElection(electionId, comment));
        }
        catch (NotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * POST /elections/{electionId}/stages/{stageId}/comments : Add a new comment for Stage
     *
     * @param electionId Election ID (required)
     * @param stageId    Election ID (required)
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<Comment> postCommentInStage(String electionId, String stageId, Comment comment) {
        try {
            return ResponseEntity.ok(electionsCache.postCommentInStage(electionId,stageId, comment));
        }
        catch (NotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
