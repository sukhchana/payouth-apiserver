package org.payouth.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Generic Stage Elements that can be associated with various stages
 */

@Schema(name = "ElectionStageElement", description = "Generic Stage Elements that can be associated with various stages")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-21T23:36:10.667381+01:00[Europe/London]")
public class ElectionStageElement implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String title;

  private String picture;

  private String details;

  @Valid
  private List<@Valid Link> links;

  @Valid
  private List<@Valid Frame> frames;

  @Valid
  private List<@Valid Comment> comments;

  public ElectionStageElement id(String id) {
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

  public ElectionStageElement title(String title) {
    this.title = title;
    return this;
  }

  /**
   * This will be the title for each stage elements
   * @return title
  */
  
  @Schema(name = "title", description = "This will be the title for each stage elements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ElectionStageElement picture(String picture) {
    this.picture = picture;
    return this;
  }

  /**
   * base64 encoded image
   * @return picture
  */
  
  @Schema(name = "picture", description = "base64 encoded image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture")
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public ElectionStageElement details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Additional Description
   * @return details
  */
  
  @Schema(name = "details", description = "Additional Description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public ElectionStageElement links(List<@Valid Link> links) {
    this.links = links;
    return this;
  }

  public ElectionStageElement addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("links")
  public List<@Valid Link> getLinks() {
    return links;
  }

  public void setLinks(List<@Valid Link> links) {
    this.links = links;
  }

  public ElectionStageElement frames(List<@Valid Frame> frames) {
    this.frames = frames;
    return this;
  }

  public ElectionStageElement addFramesItem(Frame framesItem) {
    if (this.frames == null) {
      this.frames = new ArrayList<>();
    }
    this.frames.add(framesItem);
    return this;
  }

  /**
   * Get frames
   * @return frames
  */
  @Valid 
  @Schema(name = "frames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frames")
  public List<@Valid Frame> getFrames() {
    return frames;
  }

  public void setFrames(List<@Valid Frame> frames) {
    this.frames = frames;
  }

  public ElectionStageElement comments(List<@Valid Comment> comments) {
    this.comments = comments;
    return this;
  }

  public ElectionStageElement addCommentsItem(Comment commentsItem) {
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
    ElectionStageElement electionStageElement = (ElectionStageElement) o;
    return Objects.equals(this.id, electionStageElement.id) &&
        Objects.equals(this.title, electionStageElement.title) &&
        Objects.equals(this.picture, electionStageElement.picture) &&
        Objects.equals(this.details, electionStageElement.details) &&
        Objects.equals(this.links, electionStageElement.links) &&
        Objects.equals(this.frames, electionStageElement.frames) &&
        Objects.equals(this.comments, electionStageElement.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, picture, details, links, frames, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectionStageElement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    frames: ").append(toIndentedString(frames)).append("\n");
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

