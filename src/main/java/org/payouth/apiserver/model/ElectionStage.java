package org.payouth.apiserver.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ElectionStage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-22T04:31:09.763985+01:00[Europe/London]")
@JsonIgnoreProperties(ignoreUnknown=true)
public class ElectionStage implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String title;

  @Valid
  private List<@Valid ElectionStageElement> elements;

  @Valid
  private List<@Valid Comment> comments;

  public ElectionStage id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ElectionStage title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ElectionStage elements(List<@Valid ElectionStageElement> elements) {
    this.elements = elements;
    return this;
  }

  public ElectionStage addElementsItem(ElectionStageElement elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * Get elements
   * @return elements
  */
  @Valid 
  @Schema(name = "elements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elements")
  public List<@Valid ElectionStageElement> getElements() {
    return elements;
  }

  public void setElements(List<@Valid ElectionStageElement> elements) {
    this.elements = elements;
  }

  public ElectionStage comments(List<@Valid Comment> comments) {
    this.comments = comments;
    return this;
  }

  public ElectionStage addCommentsItem(Comment commentsItem) {
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
    ElectionStage electionStage = (ElectionStage) o;
    return Objects.equals(this.id, electionStage.id) &&
        Objects.equals(this.title, electionStage.title) &&
        Objects.equals(this.elements, electionStage.elements) &&
        Objects.equals(this.comments, electionStage.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, elements, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectionStage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
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

