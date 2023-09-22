package org.payouth.apiserver.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Candidate profile
 */

@Schema(name = "Candidate", description = "Candidate profile")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-22T17:53:20.513631+01:00[Europe/London]")
@DynamoDBTable(tableName = "candidates")
public class Candidate implements Serializable {

  private static final long serialVersionUID = 1L;

  @DynamoDBHashKey
  private String id;

  @DynamoDBAttribute
  private Gender gender;

  @DynamoDBAttribute
  private String firstName;

  @DynamoDBAttribute
  private String lastName;

  @DynamoDBAttribute
  private String picture;

  @DynamoDBAttribute
  private PoliticalParty party;

  @Valid
  @DynamoDBAttribute
  private List<String> pledges;

  @Valid
  @DynamoDBAttribute
  private List<String> policies;

  @DynamoDBAttribute
  private String summary;

  @DynamoDBAttribute
  private Boolean incumbent;

  public Candidate id(String id) {
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

  public Candidate policies(List<String> policies) {
    this.policies = policies;
    return this;
  }

  public Candidate addPoliciesItem(String policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

  /**
   * Get policies
   * @return policies
  */
  
  @Schema(name = "policies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policies")
  public List<String> getPolicies() {
    return policies;
  }

  public void setPolicies(List<String> policies) {
    this.policies = policies;
  }

  public Candidate summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
  
  @Schema(name = "summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public Candidate incumbent(Boolean incumbent) {
    this.incumbent = incumbent;
    return this;
  }

  /**
   * Get incumbent
   * @return incumbent
  */
  
  @Schema(name = "incumbent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incumbent")
  public Boolean getIncumbent() {
    return incumbent;
  }

  public void setIncumbent(Boolean incumbent) {
    this.incumbent = incumbent;
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
    return Objects.equals(this.id, candidate.id) &&
        Objects.equals(this.gender, candidate.gender) &&
        Objects.equals(this.firstName, candidate.firstName) &&
        Objects.equals(this.lastName, candidate.lastName) &&
        Objects.equals(this.picture, candidate.picture) &&
        Objects.equals(this.party, candidate.party) &&
        Objects.equals(this.pledges, candidate.pledges) &&
        Objects.equals(this.policies, candidate.policies) &&
        Objects.equals(this.summary, candidate.summary) &&
        Objects.equals(this.incumbent, candidate.incumbent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gender, firstName, lastName, picture, party, pledges, policies, summary, incumbent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Candidate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
    sb.append("    pledges: ").append(toIndentedString(pledges)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    incumbent: ").append(toIndentedString(incumbent)).append("\n");
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

