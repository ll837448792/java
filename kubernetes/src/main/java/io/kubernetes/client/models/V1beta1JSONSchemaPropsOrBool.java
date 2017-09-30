/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1beta1JSONSchemaProps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property.
 */
@ApiModel(description = "JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property.")

public class V1beta1JSONSchemaPropsOrBool {
  @SerializedName("Allows")
  private Boolean allows = null;

  @SerializedName("Schema")
  private V1beta1JSONSchemaProps schema = null;

  public V1beta1JSONSchemaPropsOrBool allows(Boolean allows) {
    this.allows = allows;
    return this;
  }

   /**
   * Get allows
   * @return allows
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isAllows() {
    return allows;
  }

  public void setAllows(Boolean allows) {
    this.allows = allows;
  }

  public V1beta1JSONSchemaPropsOrBool schema(V1beta1JSONSchemaProps schema) {
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @ApiModelProperty(required = true, value = "")
  public V1beta1JSONSchemaProps getSchema() {
    return schema;
  }

  public void setSchema(V1beta1JSONSchemaProps schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1JSONSchemaPropsOrBool v1beta1JSONSchemaPropsOrBool = (V1beta1JSONSchemaPropsOrBool) o;
    return Objects.equals(this.allows, v1beta1JSONSchemaPropsOrBool.allows) &&
        Objects.equals(this.schema, v1beta1JSONSchemaPropsOrBool.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allows, schema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1JSONSchemaPropsOrBool {\n");
    
    sb.append("    allows: ").append(toIndentedString(allows)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

