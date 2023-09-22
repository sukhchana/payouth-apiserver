package org.payouth.apiserver.api;

import lombok.AllArgsConstructor;
import org.payouth.apiserver.api.interfaces.ElectionsApi;
import org.payouth.apiserver.service.InMemoryService;
import org.payouth.apiserver.model.CreateElectionRequestStagesInner;
import org.payouth.apiserver.model.Election;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ElectionsImplApi implements ElectionsApi {

    private InMemoryService electionsCache;

    /**
     * POST /elections : Create Election
     * Create a new Election.
     *
     * @param createElectionRequest Created Election object (optional)
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<Election> createElection(Election createElectionRequest) {
        return ResponseEntity.ok(electionsCache.createElection(createElectionRequest));
    }

    /**
     * POST /elections/{electionId}/stages : Create Election Stage
     * Create a new Election Stage.
     *
     * @param electionId                       Election ID (required)
     * @param createElectionRequestStagesInner Created Election object (optional)
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<CreateElectionRequestStagesInner> createElectionStage(String electionId, CreateElectionRequestStagesInner createElectionRequestStagesInner) {
        return null;
    }

    /**
     * DELETE /elections/{electionId} : Delete election
     * Delete Election
     *
     * @param electionId The election that needs to be deleted (required)
     * @return Invalid electionId supplied (status code 400)
     * or electionId not found (status code 404)
     */
    @Override
    public ResponseEntity<Void> deleteElection(String electionId) {
        electionsCache.deleteElection(electionId);
        return ResponseEntity.noContent().build();
    }

    /**
     * DELETE /elections/{electionId}/stages/{stageId} : Delete election Stage
     * Delete Election Stage
     *
     * @param electionId The election (required)
     * @param stageId    The stageId that needs to be deleted (required)
     * @return Invalid Id supplied (status code 400)
     * or Id not found (status code 404)
     */
    @Override
    public ResponseEntity<Void> deleteElectionStage(String electionId, String stageId) {
        return null;
    }

    /**
     * GET /elections/{electionId} : Returns a specific election
     *
     * @param electionId Election ID (required)
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<Election> getElectionById(String electionId) {
        var election = electionsCache.getElection(electionId);
        return election.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * GET /elections/{electionId}/stages : Returns Election Stages
     *
     * @param electionId Election ID (required)
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<CreateElectionRequestStagesInner> getElectionStages(String electionId) {
        return null;
    }

    /**
     * GET /elections : Returns list of elections
     *
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<List<Election>> getElections() {
        return ResponseEntity.ok(electionsCache.getElections());
    }
}
