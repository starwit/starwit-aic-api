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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import eu.kicockpit.JSON;

/**
 * Decision
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-24T17:00:16.566867707+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class Decision {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @jakarta.annotation.Nullable
  private Long id;

  public static final String SERIALIZED_NAME_ACQUISITION_TIME = "acquisitionTime";
  @SerializedName(SERIALIZED_NAME_ACQUISITION_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime acquisitionTime;

  public static final String SERIALIZED_NAME_MEDIA_URL = "mediaUrl";
  @SerializedName(SERIALIZED_NAME_MEDIA_URL)
  @jakarta.annotation.Nullable
  private String mediaUrl;

  public static final String SERIALIZED_NAME_ACTION_VISUALIZATION_URL = "actionVisualizationUrl";
  @SerializedName(SERIALIZED_NAME_ACTION_VISUALIZATION_URL)
  @jakarta.annotation.Nullable
  private String actionVisualizationUrl;

  public static final String SERIALIZED_NAME_CAMERA_LATITUDE = "cameraLatitude";
  @SerializedName(SERIALIZED_NAME_CAMERA_LATITUDE)
  @jakarta.annotation.Nullable
  private BigDecimal cameraLatitude;

  public static final String SERIALIZED_NAME_CAMERA_LONGITUDE = "cameraLongitude";
  @SerializedName(SERIALIZED_NAME_CAMERA_LONGITUDE)
  @jakarta.annotation.Nullable
  private BigDecimal cameraLongitude;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    NEW("NEW"),
    
    ACCEPTED("ACCEPTED"),
    
    REJECTED("REJECTED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @jakarta.annotation.Nullable
  private StateEnum state;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @jakarta.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_MODULE = "module";
  @SerializedName(SERIALIZED_NAME_MODULE)
  @jakarta.annotation.Nullable
  private Module module;

  public static final String SERIALIZED_NAME_DECISION_TYPE = "decisionType";
  @SerializedName(SERIALIZED_NAME_DECISION_TYPE)
  @jakarta.annotation.Nullable
  private DecisionType decisionType;

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  @jakarta.annotation.Nullable
  private Set<Action> actions = new LinkedHashSet<>();

  public Decision() {
  }

  public Decision id(@jakarta.annotation.Nullable Long id) {
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


  public Decision acquisitionTime(@jakarta.annotation.Nullable OffsetDateTime acquisitionTime) {
    this.acquisitionTime = acquisitionTime;
    return this;
  }

  /**
   * Timestamp when the decision was made
   * @return acquisitionTime
   */
  @jakarta.annotation.Nullable
  public OffsetDateTime getAcquisitionTime() {
    return acquisitionTime;
  }

  public void setAcquisitionTime(@jakarta.annotation.Nullable OffsetDateTime acquisitionTime) {
    this.acquisitionTime = acquisitionTime;
  }


  public Decision mediaUrl(@jakarta.annotation.Nullable String mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

  /**
   * Media the decision was based on
   * @return mediaUrl
   */
  @jakarta.annotation.Nullable
  public String getMediaUrl() {
    return mediaUrl;
  }

  public void setMediaUrl(@jakarta.annotation.Nullable String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }


  public Decision actionVisualizationUrl(@jakarta.annotation.Nullable String actionVisualizationUrl) {
    this.actionVisualizationUrl = actionVisualizationUrl;
    return this;
  }

  /**
   * Media the decision was based on
   * @return actionVisualizationUrl
   */
  @jakarta.annotation.Nullable
  public String getActionVisualizationUrl() {
    return actionVisualizationUrl;
  }

  public void setActionVisualizationUrl(@jakarta.annotation.Nullable String actionVisualizationUrl) {
    this.actionVisualizationUrl = actionVisualizationUrl;
  }


  public Decision cameraLatitude(@jakarta.annotation.Nullable BigDecimal cameraLatitude) {
    this.cameraLatitude = cameraLatitude;
    return this;
  }

  /**
   * Get cameraLatitude
   * @return cameraLatitude
   */
  @jakarta.annotation.Nullable
  public BigDecimal getCameraLatitude() {
    return cameraLatitude;
  }

  public void setCameraLatitude(@jakarta.annotation.Nullable BigDecimal cameraLatitude) {
    this.cameraLatitude = cameraLatitude;
  }


  public Decision cameraLongitude(@jakarta.annotation.Nullable BigDecimal cameraLongitude) {
    this.cameraLongitude = cameraLongitude;
    return this;
  }

  /**
   * Get cameraLongitude
   * @return cameraLongitude
   */
  @jakarta.annotation.Nullable
  public BigDecimal getCameraLongitude() {
    return cameraLongitude;
  }

  public void setCameraLongitude(@jakarta.annotation.Nullable BigDecimal cameraLongitude) {
    this.cameraLongitude = cameraLongitude;
  }


  public Decision state(@jakarta.annotation.Nullable StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @jakarta.annotation.Nullable
  public StateEnum getState() {
    return state;
  }

  public void setState(@jakarta.annotation.Nullable StateEnum state) {
    this.state = state;
  }


  public Decision description(@jakarta.annotation.Nullable String description) {
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


  public Decision module(@jakarta.annotation.Nullable Module module) {
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


  public Decision decisionType(@jakarta.annotation.Nullable DecisionType decisionType) {
    this.decisionType = decisionType;
    return this;
  }

  /**
   * Get decisionType
   * @return decisionType
   */
  @jakarta.annotation.Nullable
  public DecisionType getDecisionType() {
    return decisionType;
  }

  public void setDecisionType(@jakarta.annotation.Nullable DecisionType decisionType) {
    this.decisionType = decisionType;
  }


  public Decision actions(@jakarta.annotation.Nullable Set<Action> actions) {
    this.actions = actions;
    return this;
  }

  public Decision addActionsItem(Action actionsItem) {
    if (this.actions == null) {
      this.actions = new LinkedHashSet<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Get actions
   * @return actions
   */
  @jakarta.annotation.Nullable
  public Set<Action> getActions() {
    return actions;
  }

  public void setActions(@jakarta.annotation.Nullable Set<Action> actions) {
    this.actions = actions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Decision decision = (Decision) o;
    return Objects.equals(this.id, decision.id) &&
        Objects.equals(this.acquisitionTime, decision.acquisitionTime) &&
        Objects.equals(this.mediaUrl, decision.mediaUrl) &&
        Objects.equals(this.actionVisualizationUrl, decision.actionVisualizationUrl) &&
        Objects.equals(this.cameraLatitude, decision.cameraLatitude) &&
        Objects.equals(this.cameraLongitude, decision.cameraLongitude) &&
        Objects.equals(this.state, decision.state) &&
        Objects.equals(this.description, decision.description) &&
        Objects.equals(this.module, decision.module) &&
        Objects.equals(this.decisionType, decision.decisionType) &&
        Objects.equals(this.actions, decision.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, acquisitionTime, mediaUrl, actionVisualizationUrl, cameraLatitude, cameraLongitude, state, description, module, decisionType, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Decision {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    acquisitionTime: ").append(toIndentedString(acquisitionTime)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    actionVisualizationUrl: ").append(toIndentedString(actionVisualizationUrl)).append("\n");
    sb.append("    cameraLatitude: ").append(toIndentedString(cameraLatitude)).append("\n");
    sb.append("    cameraLongitude: ").append(toIndentedString(cameraLongitude)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    decisionType: ").append(toIndentedString(decisionType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
    openapiFields.add("acquisitionTime");
    openapiFields.add("mediaUrl");
    openapiFields.add("actionVisualizationUrl");
    openapiFields.add("cameraLatitude");
    openapiFields.add("cameraLongitude");
    openapiFields.add("state");
    openapiFields.add("description");
    openapiFields.add("module");
    openapiFields.add("decisionType");
    openapiFields.add("actions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Decision
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Decision.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Decision is not found in the empty JSON string", Decision.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Decision.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Decision` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("mediaUrl") != null && !jsonObj.get("mediaUrl").isJsonNull()) && !jsonObj.get("mediaUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mediaUrl").toString()));
      }
      if ((jsonObj.get("actionVisualizationUrl") != null && !jsonObj.get("actionVisualizationUrl").isJsonNull()) && !jsonObj.get("actionVisualizationUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actionVisualizationUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actionVisualizationUrl").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        StateEnum.validateJsonElement(jsonObj.get("state"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `module`
      if (jsonObj.get("module") != null && !jsonObj.get("module").isJsonNull()) {
        Module.validateJsonElement(jsonObj.get("module"));
      }
      // validate the optional field `decisionType`
      if (jsonObj.get("decisionType") != null && !jsonObj.get("decisionType").isJsonNull()) {
        DecisionType.validateJsonElement(jsonObj.get("decisionType"));
      }
      if (jsonObj.get("actions") != null && !jsonObj.get("actions").isJsonNull()) {
        JsonArray jsonArrayactions = jsonObj.getAsJsonArray("actions");
        if (jsonArrayactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("actions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `actions` to be an array in the JSON string but got `%s`", jsonObj.get("actions").toString()));
          }

          // validate the optional field `actions` (array)
          for (int i = 0; i < jsonArrayactions.size(); i++) {
            Action.validateJsonElement(jsonArrayactions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Decision.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Decision' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Decision> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Decision.class));

       return (TypeAdapter<T>) new TypeAdapter<Decision>() {
           @Override
           public void write(JsonWriter out, Decision value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Decision read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Decision given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Decision
   * @throws IOException if the JSON string is invalid with respect to Decision
   */
  public static Decision fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Decision.class);
  }

  /**
   * Convert an instance of Decision to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
