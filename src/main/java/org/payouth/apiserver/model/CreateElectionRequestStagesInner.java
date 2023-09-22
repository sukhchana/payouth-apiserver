package org.payouth.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * CreateElectionRequestStagesInner
 */

@JsonTypeName("createElection_request_stages_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-21T23:36:10.667381+01:00[Europe/London]")
public class CreateElectionRequestStagesInner implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String title;

  @Valid
  private List<@Valid ElectionStageElement> elements;

  private List<Comment> comments;

  public CreateElectionRequestStagesInner id(String id) {
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

  public CreateElectionRequestStagesInner title(String title) {
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

  public CreateElectionRequestStagesInner elements(List<@Valid ElectionStageElement> elements) {
    this.elements = elements;
    return this;
  }

  public CreateElectionRequestStagesInner addElementsItem(ElectionStageElement elementsItem) {
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

  public CreateElectionRequestStagesInner comments(List<Comment> comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Get comments
   * @return comments
  */
  
  @Schema(name = "comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comments")
  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
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
    CreateElectionRequestStagesInner createElectionRequestStagesInner = (CreateElectionRequestStagesInner) o;
    return Objects.equals(this.id, createElectionRequestStagesInner.id) &&
        Objects.equals(this.title, createElectionRequestStagesInner.title) &&
        Objects.equals(this.elements, createElectionRequestStagesInner.elements) &&
            Objects.equals(this.comments, createElectionRequestStagesInner.comments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, elements, comments);
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
    sb.append("class CreateElectionRequestStagesInner {\n");
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

