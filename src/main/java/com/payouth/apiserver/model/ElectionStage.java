package com.payouth.apiserver.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * ElectionStage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-21T20:54:05.835883+01:00[Europe/London]")
public class ElectionStage {

  private String id;

  private String title;

  @Valid
  private List<@Valid ElectionStageElement> elements;

  private JsonNullable<Object> comments = JsonNullable.<Object>undefined();

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

  public ElectionStage comments(Object comments) {
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
    ElectionStage electionStage = (ElectionStage) o;
    return Objects.equals(this.id, electionStage.id) &&
        Objects.equals(this.title, electionStage.title) &&
        Objects.equals(this.elements, electionStage.elements) &&
        equalsNullable(this.comments, electionStage.comments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, elements, hashCodeNullable(comments));
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

