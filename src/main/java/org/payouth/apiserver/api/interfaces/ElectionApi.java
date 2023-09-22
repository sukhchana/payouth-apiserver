/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.payouth.apiserver.api.interfaces;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.payouth.apiserver.model.Election;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.List;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-22T04:47:51.835270+01:00[Europe/London]")
@Validated
@Tag(name = "election", description = "Election")
public interface ElectionApi {

    /**
     * POST /elections : Create Election
     * Create a new Election.
     *
     * @param election Created Election object (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "createElection",
        summary = "Create Election",
        description = "Create a new Election.",
        tags = { "election" },
        responses = {
            @ApiResponse(responseCode = "default", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Election.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/elections",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<Election> createElection(
        @Parameter(name = "Election", description = "Created Election object") @Valid @RequestBody(required = false) Election election
    );


    /**
     * DELETE /elections/{electionId} : Delete election
     * Delete Election
     *
     * @param electionId The election that needs to be deleted (required)
     * @return Invalid electionId supplied (status code 400)
     *         or electionId not found (status code 404)
     */
    @Operation(
        operationId = "deleteElection",
        summary = "Delete election",
        description = "Delete Election",
        tags = { "election" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid electionId supplied"),
            @ApiResponse(responseCode = "404", description = "electionId not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/elections/{electionId}"
    )
    ResponseEntity<Void> deleteElection(
        @Parameter(name = "electionId", description = "The election that needs to be deleted", required = true, in = ParameterIn.PATH) @PathVariable("electionId") String electionId
    );


    /**
     * GET /elections/{electionId} : Returns a specific election
     *
     * @param electionId Election ID (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "getElectionById",
        summary = "Returns a specific election",
        tags = { "election" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Election.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/elections/{electionId}",
        produces = { "application/json" }
    )
    ResponseEntity<Election> getElectionById(
        @Parameter(name = "electionId", description = "Election ID", required = true, in = ParameterIn.PATH) @PathVariable("electionId") String electionId
    );


    /**
     * GET /elections : Returns list of elections
     *
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "getElections",
        summary = "Returns list of elections",
        tags = { "election" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Election.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/elections",
        produces = { "application/json" }
    )
    ResponseEntity<List<Election>> getElections(
        
    );

}