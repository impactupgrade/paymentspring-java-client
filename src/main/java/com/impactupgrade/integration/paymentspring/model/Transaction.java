package com.impactupgrade.integration.paymentspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.impactupgrade.integration.paymentspring.internal.TransactionDateJsonDeserializer;

import java.util.Date;
import java.util.Map;

public class Transaction implements AbstractModel {

  private String id;

  @JsonProperty("created_at")
  @JsonDeserialize(using = TransactionDateJsonDeserializer.class)
  private Date createdAt;
  @JsonProperty("customer_id")
  private String customerId;

  private Map<String, String> metadata;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
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
