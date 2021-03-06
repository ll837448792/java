/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.13.5
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
import io.kubernetes.client.models.ApiextensionsV1beta1WebhookClientConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CustomResourceConversion describes how to convert different versions of a CR.
 */
@ApiModel(description = "CustomResourceConversion describes how to convert different versions of a CR.")

public class V1beta1CustomResourceConversion {
  @SerializedName("strategy")
  private String strategy = null;

  @SerializedName("webhookClientConfig")
  private ApiextensionsV1beta1WebhookClientConfig webhookClientConfig = null;

  public V1beta1CustomResourceConversion strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * &#x60;strategy&#x60; specifies the conversion strategy. Allowed values are: - &#x60;None&#x60;: The converter only change the apiVersion and would not touch any other field in the CR. - &#x60;Webhook&#x60;: API Server will call to an external webhook to do the conversion. Additional information is needed for this option.
   * @return strategy
  **/
  @ApiModelProperty(required = true, value = "`strategy` specifies the conversion strategy. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the CR. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information is needed for this option.")
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }

  public V1beta1CustomResourceConversion webhookClientConfig(ApiextensionsV1beta1WebhookClientConfig webhookClientConfig) {
    this.webhookClientConfig = webhookClientConfig;
    return this;
  }

   /**
   * &#x60;webhookClientConfig&#x60; is the instructions for how to call the webhook if strategy is &#x60;Webhook&#x60;. This field is alpha-level and is only honored by servers that enable the CustomResourceWebhookConversion feature.
   * @return webhookClientConfig
  **/
  @ApiModelProperty(value = "`webhookClientConfig` is the instructions for how to call the webhook if strategy is `Webhook`. This field is alpha-level and is only honored by servers that enable the CustomResourceWebhookConversion feature.")
  public ApiextensionsV1beta1WebhookClientConfig getWebhookClientConfig() {
    return webhookClientConfig;
  }

  public void setWebhookClientConfig(ApiextensionsV1beta1WebhookClientConfig webhookClientConfig) {
    this.webhookClientConfig = webhookClientConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CustomResourceConversion v1beta1CustomResourceConversion = (V1beta1CustomResourceConversion) o;
    return Objects.equals(this.strategy, v1beta1CustomResourceConversion.strategy) &&
        Objects.equals(this.webhookClientConfig, v1beta1CustomResourceConversion.webhookClientConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategy, webhookClientConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CustomResourceConversion {\n");
    
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    webhookClientConfig: ").append(toIndentedString(webhookClientConfig)).append("\n");
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

