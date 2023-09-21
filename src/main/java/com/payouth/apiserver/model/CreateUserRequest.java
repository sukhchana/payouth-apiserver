package com.payouth.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CreateUserRequest
 */

@JsonTypeName("createUser_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-21T20:54:05.835883+01:00[Europe/London]")
public class CreateUserRequest {

  private Long id;

  private String username;

  private String firstName;

  private String lastName;

  private String email;

  private CreateUserRequestLocation location;

  @Valid
  private List<String> completedStages;

  public CreateUserRequest id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CreateUserRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  
  @Schema(name = "username", example = "theUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CreateUserRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "firstName", example = "John", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CreateUserRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "lastName", example = "James", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CreateUserRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", example = "john@email.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateUserRequest location(CreateUserRequestLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @Valid 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public CreateUserRequestLocation getLocation() {
    return location;
  }

  public void setLocation(CreateUserRequestLocation location) {
    this.location = location;
  }

  public CreateUserRequest completedStages(List<String> completedStages) {
    this.completedStages = completedStages;
    return this;
  }

  public CreateUserRequest addCompletedStagesItem(String completedStagesItem) {
    if (this.completedStages == null) {
      this.completedStages = new ArrayList<>();
    }
    this.completedStages.add(completedStagesItem);
    return this;
  }

  /**
   * Get completedStages
   * @return completedStages
  */
  
  @Schema(name = "completedStages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedStages")
  public List<String> getCompletedStages() {
    return completedStages;
  }

  public void setCompletedStages(List<String> completedStages) {
    this.completedStages = completedStages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserRequest createUserRequest = (CreateUserRequest) o;
    return Objects.equals(this.id, createUserRequest.id) &&
        Objects.equals(this.username, createUserRequest.username) &&
        Objects.equals(this.firstName, createUserRequest.firstName) &&
        Objects.equals(this.lastName, createUserRequest.lastName) &&
        Objects.equals(this.email, createUserRequest.email) &&
        Objects.equals(this.location, createUserRequest.location) &&
        Objects.equals(this.completedStages, createUserRequest.completedStages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, firstName, lastName, email, location, completedStages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    completedStages: ").append(toIndentedString(completedStages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

