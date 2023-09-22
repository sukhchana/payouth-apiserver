package org.payouth.apiserver.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets PoliticalParty
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-22T10:47:57.186928900-04:00[America/New_York]")
public enum PoliticalParty {
  
  DEMOCRATIC("Democratic"),
  
  REPUBLICAN("Republican"),
  
  GREEN("Green"),
  
  CONSTITUTION("Constitution"),
  
  INDEPENDENT("Independent"),
  
  SOCIALIST("Socialist"),
  
  COMMUNIST("Communist"),
  
  LIBERAL("Liberal"),
  
  REFORM("Reform");

  private String value;

  PoliticalParty(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PoliticalParty fromValue(String value) {
    for (PoliticalParty b : PoliticalParty.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

