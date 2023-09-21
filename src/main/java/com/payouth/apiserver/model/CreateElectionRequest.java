package com.payouth.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * CreateElectionRequest
 */

@JsonTypeName("createElection_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-21T20:54:05.835883+01:00[Europe/London]")
public class CreateElectionRequest {

  private String id;

  private String name;

  private String details;

  @Valid
  private List<@Valid CreateElectionRequestStagesInner> stages;

  private JsonNullable<Object> comments = JsonNullable.<Object>undefined();

  public CreateElectionRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "2023USA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateElectionRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", example = "2023 USA Election", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateElectionRequest details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
  */
  
  @Schema(name = "details", example = "This election is to elect the president of USA 2023", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public CreateElectionRequest stages(List<@Valid CreateElectionRequestStagesInner> stages) {
    this.stages = stages;
    return this;
  }

  public CreateElectionRequest addStagesItem(CreateElectionRequestStagesInner stagesItem) {
    if (this.stages == null) {
      this.stages = new ArrayList<>();
    }
    this.stages.add(stagesItem);
    return this;
  }

  /**
   * Get stages
   * @return stages
  */
  @Valid 
  @Schema(name = "stages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stages")
  public List<@Valid CreateElectionRequestStagesInner> getStages() {
    return stages;
  }

  public void setStages(List<@Valid CreateElectionRequestStagesInner> stages) {
    this.stages = stages;
  }

  public CreateElectionRequest comments(Object comments) {
    this.comments = JsonNullable.of(comments);
    return this;
  }

  /**
   * Get comments
   * @return comments
  */
  
  @Schema(name = "comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comments")
  public JsonNullable<Object> getComments() {
    return comments;
  }

  public void setComments(JsonNullable<Object> comments) {
    this.comments = comments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateElectionRequest createElectionRequest = (CreateElectionRequest) o;
    return Objects.equals(this.id, createElectionRequest.id) &&
        Objects.equals(this.name, createElectionRequest.name) &&
        Objects.equals(this.details, createElectionRequest.details) &&
        Objects.equals(this.stages, createElectionRequest.stages) &&
        equalsNullable(this.comments, createElectionRequest.comments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, details, stages, hashCodeNullable(comments));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateElectionRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

