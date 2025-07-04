/*
 * merged spec
 * merged spec
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.starwit.aic.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.starwit.aic.model.Module;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.starwit.aic.JSON;

/**
 * A type of action that a system can execute
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-04T12:43:11.182602420Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class ActionType {
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

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  @jakarta.annotation.Nullable
  private String endpoint;

  /**
   * Gets or Sets executionPolicy
   */
  @JsonAdapter(ExecutionPolicyEnum.Adapter.class)
  public enum ExecutionPolicyEnum {
    MANUAL("MANUAL"),
    
    WITHCHECK("WITHCHECK"),
    
    AUTOMATIC("AUTOMATIC");

    private String value;

    ExecutionPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExecutionPolicyEnum fromValue(String value) {
      for (ExecutionPolicyEnum b : ExecutionPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExecutionPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExecutionPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExecutionPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExecutionPolicyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ExecutionPolicyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EXECUTION_POLICY = "executionPolicy";
  @SerializedName(SERIALIZED_NAME_EXECUTION_POLICY)
  @jakarta.annotation.Nullable
  private ExecutionPolicyEnum executionPolicy;

  public static final String SERIALIZED_NAME_MODULE = "module";
  @SerializedName(SERIALIZED_NAME_MODULE)
  @jakarta.annotation.Nullable
  private Module module;

  public ActionType() {
  }

  public ActionType id(@jakarta.annotation.Nullable Long id) {
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


  public ActionType name(@jakarta.annotation.Nullable String name) {
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


  public ActionType description(@jakarta.annotation.Nullable String description) {
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


  public ActionType endpoint(@jakarta.annotation.Nullable String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
   */
  @jakarta.annotation.Nullable
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(@jakarta.annotation.Nullable String endpoint) {
    this.endpoint = endpoint;
  }


  public ActionType executionPolicy(@jakarta.annotation.Nullable ExecutionPolicyEnum executionPolicy) {
    this.executionPolicy = executionPolicy;
    return this;
  }

  /**
   * Get executionPolicy
   * @return executionPolicy
   */
  @jakarta.annotation.Nullable
  public ExecutionPolicyEnum getExecutionPolicy() {
    return executionPolicy;
  }

  public void setExecutionPolicy(@jakarta.annotation.Nullable ExecutionPolicyEnum executionPolicy) {
    this.executionPolicy = executionPolicy;
  }


  public ActionType module(@jakarta.annotation.Nullable Module module) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionType actionType = (ActionType) o;
    return Objects.equals(this.id, actionType.id) &&
        Objects.equals(this.name, actionType.name) &&
        Objects.equals(this.description, actionType.description) &&
        Objects.equals(this.endpoint, actionType.endpoint) &&
        Objects.equals(this.executionPolicy, actionType.executionPolicy) &&
        Objects.equals(this.module, actionType.module);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, endpoint, executionPolicy, module);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    executionPolicy: ").append(toIndentedString(executionPolicy)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
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
    openapiFields.add("endpoint");
    openapiFields.add("executionPolicy");
    openapiFields.add("module");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ActionType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ActionType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActionType is not found in the empty JSON string", ActionType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ActionType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActionType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("endpoint") != null && !jsonObj.get("endpoint").isJsonNull()) && !jsonObj.get("endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint").toString()));
      }
      if ((jsonObj.get("executionPolicy") != null && !jsonObj.get("executionPolicy").isJsonNull()) && !jsonObj.get("executionPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `executionPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("executionPolicy").toString()));
      }
      // validate the optional field `executionPolicy`
      if (jsonObj.get("executionPolicy") != null && !jsonObj.get("executionPolicy").isJsonNull()) {
        ExecutionPolicyEnum.validateJsonElement(jsonObj.get("executionPolicy"));
      }
      // validate the optional field `module`
      if (jsonObj.get("module") != null && !jsonObj.get("module").isJsonNull()) {
        Module.validateJsonElement(jsonObj.get("module"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActionType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActionType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActionType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActionType.class));

       return (TypeAdapter<T>) new TypeAdapter<ActionType>() {
           @Override
           public void write(JsonWriter out, ActionType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActionType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ActionType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ActionType
   * @throws IOException if the JSON string is invalid with respect to ActionType
   */
  public static ActionType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActionType.class);
  }

  /**
   * Convert an instance of ActionType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

