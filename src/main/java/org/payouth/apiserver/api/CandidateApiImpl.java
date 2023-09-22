package org.payouth.apiserver.api;

import lombok.AllArgsConstructor;
import org.payouth.apiserver.api.interfaces.CandidateApi;
import org.payouth.apiserver.model.Candidate;
import org.payouth.apiserver.service.CandidateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin()
@AllArgsConstructor
public class CandidateApiImpl implements CandidateApi {

    private CandidateService candidateService;
    @Override
    public ResponseEntity<Candidate> createCandidate(Candidate candidate) {
        return ResponseEntity.ok(candidateService.addCandidate(candidate));
    }

    @Override
    public ResponseEntity<Candidate> getCandidateById(String candidateId) {
        var candidate = candidateService.getCandidate(candidateId);
        return candidate.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<List<Candidate>> getCandidates() {
        return ResponseEntity.ok(candidateService.getCandidates());
    }

    @Override
    public ResponseEntity<Candidate> updateCandidate(String candidateId, Candidate candidate) {
        return ResponseEntity.ok(candidateService.addCandidate(candidate));
    }
}
