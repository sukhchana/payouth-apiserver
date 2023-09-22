package org.payouth.apiserver.model;

import java.net.URI;
import java.util.Objects;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.payouth.apiserver.model.Gender;
import org.payouth.apiserver.model.UserLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * User
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-22T10:47:57.186928900-04:00[America/New_York]")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "user")
public class User implements Serializable {

  private static final long serialVersionUID = 1L;
  @DynamoDBAttribute
  private String firstName;
  @DynamoDBAttribute
  private String lastName;
  @DynamoDBAttribute
  private Gender gender;
  @DynamoDBAttribute
  private String dateOfBirth;
  @DynamoDBAttribute
  private String race;
  @DynamoDBHashKey
  private String email;
  @DynamoDBAttribute
  private UserLocation location;

  @Valid
  @DynamoDBAttribute
  private List<String> completedStages = new ArrayList<>();



  public User firstName(String firstName) {
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

  public User lastName(String lastName) {
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

  public User gender(Gender gender) {
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

  public User dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  
  @Schema(name = "dateOfBirth", example = "01/01/1990", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateOfBirth")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public User race(String race) {
    this.race = race;
    return this;
  }

  /**
   * Get race
   * @return race
  */
  
  @Schema(name = "race", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("race")
  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public User email(String email) {
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

  public User location(UserLocation location) {
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
  public UserLocation getLocation() {
    return location;
  }

  public void setLocation(UserLocation location) {
    this.location = location;
  }

  public User completedStages(List<String> completedStages) {
    this.completedStages = completedStages;
    return this;
  }

  public User addCompletedStagesItem(String completedStagesItem) {
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
    User user = (User) o;
    return Objects.equals(this.email, user.email) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.gender, user.gender) &&
        Objects.equals(this.dateOfBirth, user.dateOfBirth) &&
        Objects.equals(this.race, user.race) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.location, user.location) &&
        Objects.equals(this.completedStages, user.completedStages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, gender, dateOfBirth, race, email, location, completedStages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
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

