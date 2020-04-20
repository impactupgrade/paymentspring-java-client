package com.impactupgrade.integration.paymentspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Subscription implements AbstractModel {

  private String id;
  @JsonProperty("customer_id")
  private String customerId;
  private Map<String, String> metadata;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }
}
