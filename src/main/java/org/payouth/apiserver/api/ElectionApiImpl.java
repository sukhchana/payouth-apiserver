package org.payouth.apiserver.api;

import lombok.AllArgsConstructor;
import org.payouth.apiserver.api.interfaces.ElectionApi;
import org.payouth.apiserver.model.Election;
import org.payouth.apiserver.service.ElectionsDBService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin()
@AllArgsConstructor
public class ElectionApiImpl implements ElectionApi {

    private ElectionsDBService electionsService;


    /**
     * POST /elections : Create Election
     * Create a new Election.
     *
     * @param createElectionRequest Created Election object (optional)
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<Election> createElection(Election createElectionRequest) {
        return ResponseEntity.ok(electionsService.createElection(createElectionRequest));
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
        electionsService.deleteElection(electionId);
        return ResponseEntity.noContent().build();
    }

    /**
     * GET /elections/{electionId} : Returns a specific election
     *
     * @param electionId Election ID (required)
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<Election> getElectionById(String electionId) {
        var election = electionsService.getElection(electionId);
        return election.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * GET /elections : Returns list of elections
     *
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<List<Election>> getElections() {
        return ResponseEntity.ok(electionsService.getElections());
    }
}
