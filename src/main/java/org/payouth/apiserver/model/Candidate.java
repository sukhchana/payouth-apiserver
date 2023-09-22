package org.payouth.apiserver.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.payouth.apiserver.model.Gender;
import org.payouth.apiserver.model.PoliticalParty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Candidate profile
 */

@Schema(name = "Candidate", description = "Candidate profile")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-22T09:45:13.422270400-04:00[America/New_York]")
public class Candidate implements Serializable {

  private static final long serialVersionUID = 1L;

  private Gender gender;

  private String firstName;

  private String lastName;

  private String picture;

  private PoliticalParty party;

  @Valid
  private List<String> pledges;

  public Candidate gender(Gender gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @Valid 
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public Candidate firstName(String firstName) {
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

  public Candidate lastName(String lastName) {
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

  public Candidate picture(String picture) {
    this.picture = picture;
    return this;
  }

  /**
   * Get picture
   * @return picture
  */
  
  @Schema(name = "picture", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture")
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public Candidate party(PoliticalParty party) {
    this.party = party;
    return this;
  }

  /**
   * Get party
   * @return party
  */
  @Valid 
  @Schema(name = "party", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("party")
  public PoliticalParty getParty() {
    return party;
  }

  public void setParty(PoliticalParty party) {
    this.party = party;
  }

  public Candidate pledges(List<String> pledges) {
    this.pledges = pledges;
    return this;
  }

  public Candidate addPledgesItem(String pledgesItem) {
    if (this.pledges == null) {
      this.pledges = new ArrayList<>();
    }
    this.pledges.add(pledgesItem);
    return this;
  }

  /**
   * Get pledges
   * @return pledges
  */
  
  @Schema(name = "pledges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pledges")
  public List<String> getPledges() {
    return pledges;
  }

  public void setPledges(List<String> pledges) {
    this.pledges = pledges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Candidate candidate = (Candidate) o;
    return Objects.equals(this.gender, candidate.gender) &&
        Objects.equals(this.firstName, candidate.firstName) &&
        Objects.equals(this.lastName, candidate.lastName) &&
        Objects.equals(this.picture, candidate.picture) &&
        Objects.equals(this.party, candidate.party) &&
        Objects.equals(this.pledges, candidate.pledges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, firstName, lastName, picture, party, pledges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Candidate {\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
    sb.append("    pledges: ").append(toIndentedString(pledges)).append("\n");
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

