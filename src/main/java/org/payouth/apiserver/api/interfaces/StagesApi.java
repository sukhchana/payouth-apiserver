/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.payouth.apiserver.api.interfaces;

import org.payouth.apiserver.model.ElectionStage;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-22T10:47:57.186928900-04:00[America/New_York]")
@Validated
@Tag(name = "stages", description = "Stages in the Election")
public interface StagesApi {

    /**
     * POST /elections/{electionId}/stages : Create Election Stage
     * Create a new Election Stage.
     *
     * @param electionId Election ID (required)
     * @param electionStage Created Election object (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "createElectionStage",
        summary = "Create Election Stage",
        description = "Create a new Election Stage.",
        tags = { "stages" },
        responses = {
            @ApiResponse(responseCode = "default", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ElectionStage.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/elections/{electionId}/stages",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<ElectionStage> createElectionStage(
        @Parameter(name = "electionId", description = "Election ID", required = true, in = ParameterIn.PATH) @PathVariable("electionId") String electionId,
        @Parameter(name = "ElectionStage", description = "Created Election object") @Valid @RequestBody(required = false) ElectionStage electionStage
    );


    /**
     * DELETE /elections/{electionId}/stages/{stageId} : Delete election Stage
     * Delete Election Stage
     *
     * @param electionId The election (required)
     * @param stageId The stageId that needs to be deleted (required)
     * @return Invalid Id supplied (status code 400)
     *         or Id not found (status code 404)
     */
    @Operation(
        operationId = "deleteElectionStage",
        summary = "Delete election Stage",
        description = "Delete Election Stage",
        tags = { "stages" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid Id supplied"),
            @ApiResponse(responseCode = "404", description = "Id not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/elections/{electionId}/stages/{stageId}"
    )
    ResponseEntity<Void> deleteElectionStage(
        @Parameter(name = "electionId", description = "The election", required = true, in = ParameterIn.PATH) @PathVariable("electionId") String electionId,
        @Parameter(name = "stageId", description = "The stageId that needs to be deleted", required = true, in = ParameterIn.PATH) @PathVariable("stageId") String stageId
    );


    /**
     * GET /elections/{electionId}/stages : Returns Election Stages
     *
     * @param electionId Election ID (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "getElectionStages",
        summary = "Returns Election Stages",
        tags = { "stages" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ElectionStage.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/elections/{electionId}/stages",
        produces = { "application/json" }
    )
    ResponseEntity<List<ElectionStage>> getElectionStages(
        @Parameter(name = "electionId", description = "Election ID", required = true, in = ParameterIn.PATH) @PathVariable("electionId") String electionId
    );

}
