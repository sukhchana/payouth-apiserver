package org.payouth.apiserver.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Election
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-22T04:31:09.763985+01:00[Europe/London]")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "electionsData")
public class Election implements Serializable {

  private static final long serialVersionUID = 1L;

  @DynamoDBHashKey
  private String id;

  @DynamoDBAttribute
  private String name;

  @DynamoDBAttribute
  private String details;

  @Valid
  @DynamoDBAttribute
  private List<@Valid ElectionStage> stages;

  @Valid
  @DynamoDBAttribute
  private List<@Valid Comment> comments;

  public Election id(String id) {
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

  public Election name(String name) {
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

  public Election details(String details) {
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

  public Election stages(List<@Valid ElectionStage> stages) {
    this.stages = stages;
    return this;
  }

  public Election addStagesItem(ElectionStage stagesItem) {
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
  public List<@Valid ElectionStage> getStages() {
    return stages;
  }

  public void setStages(List<@Valid ElectionStage> stages) {
    this.stages = stages;
  }

  public Election comments(List<@Valid Comment> comments) {
    this.comments = comments;
    return this;
  }

  public Election addCommentsItem(Comment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Get comments
   * @return comments
  */
  @Valid 
  @Schema(name = "comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comments")
  public List<@Valid Comment> getComments() {
    return comments;
  }

  public void setComments(List<@Valid Comment> comments) {
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
    Election election = (Election) o;
    return Objects.equals(this.id, election.id) &&
        Objects.equals(this.name, election.name) &&
        Objects.equals(this.details, election.details) &&
        Objects.equals(this.stages, election.stages) &&
        Objects.equals(this.comments, election.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, details, stages, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Election {\n");
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

