/*
 * AI Cockpit Decisions
 * This API is part of project AI cockpit.   For more details see: https://www.kicockpit.eu/ 
 *
 * The version of the OpenAPI document: 0.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package eu.kicockpit.model;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import eu.kicockpit.JSON;

/**
 * DecisionType
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-24T17:00:16.566867707+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class DecisionType {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @jakarta.annotation.Nullable
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @jakarta.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_MODULE = "module";
  @SerializedName(SERIALIZED_NAME_MODULE)
  @jakarta.annotation.Nullable
  private Module module;

  public static final String SERIALIZED_NAME_DECISIONS = "decisions";
  @SerializedName(SERIALIZED_NAME_DECISIONS)
  @jakarta.annotation.Nullable
  private Set<Decision> decisions = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_ACTION_TYPES = "actionTypes";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPES)
  @jakarta.annotation.Nullable
  private Set<ActionType> actionTypes = new LinkedHashSet<>();

  public DecisionType() {
  }

  public DecisionType id(@jakarta.annotation.Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @jakarta.annotation.Nullable
  public Long getId() {
    return id;
  }

  public void setId(@jakarta.annotation.Nullable Long id) {
    this.id = id;
  }


  public DecisionType name(@jakarta.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nullable String name) {
    this.name = name;
  }


  public DecisionType description(@jakarta.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@jakarta.annotation.Nullable String description) {
    this.description = description;
  }


  public DecisionType module(@jakarta.annotation.Nullable Module module) {
    this.module = module;
    return this;
  }

  /**
   * Get module
   * @return module
   */
  @jakarta.annotation.Nullable
  public Module getModule() {
    return module;
  }

  public void setModule(@jakarta.annotation.Nullable Module module) {
    this.module = module;
  }


  public DecisionType decisions(@jakarta.annotation.Nullable Set<Decision> decisions) {
    this.decisions = decisions;
    return this;
  }

  public DecisionType addDecisionsItem(Decision decisionsItem) {
    if (this.decisions == null) {
      this.decisions = new LinkedHashSet<>();
    }
    this.decisions.add(decisionsItem);
    return this;
  }

  /**
   * Get decisions
   * @return decisions
   */
  @jakarta.annotation.Nullable
  public Set<Decision> getDecisions() {
    return decisions;
  }

  public void setDecisions(@jakarta.annotation.Nullable Set<Decision> decisions) {
    this.decisions = decisions;
  }


  public DecisionType actionTypes(@jakarta.annotation.Nullable Set<ActionType> actionTypes) {
    this.actionTypes = actionTypes;
    return this;
  }

  public DecisionType addActionTypesItem(ActionType actionTypesItem) {
    if (this.actionTypes == null) {
      this.actionTypes = new LinkedHashSet<>();
    }
    this.actionTypes.add(actionTypesItem);
    return this;
  }

  /**
   * Get actionTypes
   * @return actionTypes
   */
  @jakarta.annotation.Nullable
  public Set<ActionType> getActionTypes() {
    return actionTypes;
  }

  public void setActionTypes(@jakarta.annotation.Nullable Set<ActionType> actionTypes) {
    this.actionTypes = actionTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionType decisionType = (DecisionType) o;
    return Objects.equals(this.id, decisionType.id) &&
        Objects.equals(this.name, decisionType.name) &&
        Objects.equals(this.description, decisionType.description) &&
        Objects.equals(this.module, decisionType.module) &&
        Objects.equals(this.decisions, decisionType.decisions) &&
        Objects.equals(this.actionTypes, decisionType.actionTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, module, decisions, actionTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    decisions: ").append(toIndentedString(decisions)).append("\n");
    sb.append("    actionTypes: ").append(toIndentedString(actionTypes)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("module");
    openapiFields.add("decisions");
    openapiFields.add("actionTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DecisionType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DecisionType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DecisionType is not found in the empty JSON string", DecisionType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DecisionType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DecisionType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `module`
      if (jsonObj.get("module") != null && !jsonObj.get("module").isJsonNull()) {
        Module.validateJsonElement(jsonObj.get("module"));
      }
      if (jsonObj.get("decisions") != null && !jsonObj.get("decisions").isJsonNull()) {
        JsonArray jsonArraydecisions = jsonObj.getAsJsonArray("decisions");
        if (jsonArraydecisions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("decisions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `decisions` to be an array in the JSON string but got `%s`", jsonObj.get("decisions").toString()));
          }

          // validate the optional field `decisions` (array)
          for (int i = 0; i < jsonArraydecisions.size(); i++) {
            Decision.validateJsonElement(jsonArraydecisions.get(i));
          };
        }
      }
      if (jsonObj.get("actionTypes") != null && !jsonObj.get("actionTypes").isJsonNull()) {
        JsonArray jsonArrayactionTypes = jsonObj.getAsJsonArray("actionTypes");
        if (jsonArrayactionTypes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("actionTypes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `actionTypes` to be an array in the JSON string but got `%s`", jsonObj.get("actionTypes").toString()));
          }

          // validate the optional field `actionTypes` (array)
          for (int i = 0; i < jsonArrayactionTypes.size(); i++) {
            ActionType.validateJsonElement(jsonArrayactionTypes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DecisionType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DecisionType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DecisionType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DecisionType.class));

       return (TypeAdapter<T>) new TypeAdapter<DecisionType>() {
           @Override
           public void write(JsonWriter out, DecisionType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DecisionType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DecisionType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DecisionType
   * @throws IOException if the JSON string is invalid with respect to DecisionType
   */
  public static DecisionType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DecisionType.class);
  }

  /**
   * Convert an instance of DecisionType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
