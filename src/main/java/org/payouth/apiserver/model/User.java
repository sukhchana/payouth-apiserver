package org.payouth.apiserver.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIgnore;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * User
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-22T10:47:57.186928900-04:00[America/New_York]")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "user_data")
public class User implements Serializable {

  private static final long serialVersionUID = 1L;

  @DynamoDBHashKey
  private String email;

  @DynamoDBAttribute
  private String firstName;

  @DynamoDBAttribute
  private String lastName;

  @DynamoDBAttribute
  private String gender;

  @DynamoDBAttribute
  private String dateOfBirth;

  @DynamoDBAttribute
  private String race;

  @DynamoDBAttribute
  private String county;

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

  public User gender(String gender) {
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
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
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

  public User county(String county) {
    this.county = county;
    return this;
  }

  /**
   * Get county
   * @return county
   */

  @Schema(name = "county", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("county")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
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
    return Objects.equals(this.firstName, user.firstName) &&
            Objects.equals(this.lastName, user.lastName) &&
            Objects.equals(this.gender, user.gender) &&
            Objects.equals(this.dateOfBirth, user.dateOfBirth) &&
            Objects.equals(this.race, user.race) &&
            Objects.equals(this.email, user.email) &&
            Objects.equals(this.county, user.county);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, gender, dateOfBirth, race, email, county);
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
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
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

