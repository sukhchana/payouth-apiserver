package org.payouth.apiserver.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.payouth.apiserver.model.Election;
import org.payouth.apiserver.service.InMemoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@Tag(name = "json", description = "APIs to read/put raw json data")
public class JsonService {

    private InMemoryService electionsCache;

    /**
     * POST /json : Add raw election data as json
     *
     * @param jsonInput Raw Json
     * @return successful operation (status code 200)
     */
    @Operation(
            operationId = "addFromJson",
            summary = "Replace In memory DB with data from JSON",
            description = "Replace In memory DB with data from JSONn.",
            tags = { "json" },
            responses = {
                    @ApiResponse(description = "successful operation", content = {
                            @Content(mediaType = "application/json",  array = @ArraySchema(schema = @Schema(implementation = Election.class)))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/json",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    ResponseEntity<List<Election>> addFromJson(
            @Parameter(name = "jsonInput", description = " Raw Json") @Valid @RequestBody(required = true) String jsonInput) throws JsonProcessingException {
        return ResponseEntity.ok(electionsCache.loadFromJson(jsonInput));
    }


    /**
     * GET /json : Returns existing in memory data as json
     *
     * @return successful operation (status code 200)
     */
    @Operation(
            operationId = "getJson",
            summary = "Returns existing in memory data as json",
            tags = { "json" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "successful operation", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/json",
            produces = { "application/json" }
    )
    ResponseEntity<String> getElections() throws JsonProcessingException {
        return ResponseEntity.ok(electionsCache.getElectionsAsJson());
    }


}
