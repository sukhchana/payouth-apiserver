/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.payouth.apiserver.api.interfaces;

import org.payouth.apiserver.model.User;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-22T15:20:41.191412500-04:00[America/New_York]")
@Validated
@Tag(name = "user", description = "Operations about user")
public interface UserApi {

    /**
     * POST /users : Create user
     * Create a new user.
     *
     * @param user Created user object (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "createUser",
        summary = "Create user",
        description = "Create a new user.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/users",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<User> createUser(
        @Parameter(name = "User", description = "Created user object") @Valid @RequestBody(required = false) User user
    );


    /**
     * DELETE /users/{email} : Delete user
     * This can only be done by the logged in user.
     *
     * @param email The name that needs to be deleted (required)
     * @return Invalid email supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "deleteUser",
        summary = "Delete user",
        description = "This can only be done by the logged in user.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid email supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/users/{email}"
    )
    ResponseEntity<Void> deleteUser(
        @Parameter(name = "email", description = "The name that needs to be deleted", required = true, in = ParameterIn.PATH) @PathVariable("email") String email
    );


    /**
     * GET /users/{email} : Get user by email
     * 
     *
     * @param email The user that needs to be fetched. (required)
     * @return successful operation (status code 200)
     *         or Invalid email supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "getUserByEmail",
        summary = "Get user by email",
        description = "",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid email supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users/{email}",
        produces = { "application/json" }
    )
    ResponseEntity<User> getUserByEmail(
        @Parameter(name = "email", description = "The user that needs to be fetched.", required = true, in = ParameterIn.PATH) @PathVariable("email") String email
    );


    /**
     * PUT /users/{email} : Update user
     * This can only be done by the logged in user.
     *
     * @param email name that need to be deleted (required)
     * @param user Update an existent user in the store (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "updateUser",
        summary = "Update user",
        description = "This can only be done by the logged in user.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "default", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/users/{email}",
        consumes = { "application/json" }
    )
    ResponseEntity<Void> updateUser(
        @Parameter(name = "email", description = "name that need to be deleted", required = true, in = ParameterIn.PATH) @PathVariable("email") String email,
        @Parameter(name = "User", description = "Update an existent user in the store") @Valid @RequestBody(required = false) User user
    );

}
