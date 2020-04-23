package com.impactupgrade.integration.paymentspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.impactupgrade.integration.paymentspring.internal.TransactionDateJsonDeserializer;

import java.util.Date;
import java.util.Map;

public class Transaction implements AbstractModel {

  private String id;

  @JsonProperty("amount_failed")
  private Long amountFailed;
  @JsonProperty("amount_settled")
  private Long amountSettled;
  @JsonProperty("created_at")
  @JsonDeserialize(using = TransactionDateJsonDeserializer.class)
  private Date createdAt;
  @JsonProperty("customer_id")
  private String customerId;
  private String description;

  private Map<String, String> metadata;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Long getAmountFailed() {
    return amountFailed;
  }

  public void setAmountFailed(Long amountFailed) {
    this.amountFailed = amountFailed;
  }

  public Long getAmountSettled() {
    return amountSettled;
  }

  public void setAmountSettled(Long amountSettled) {
    this.amountSettled = amountSettled;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  @Override
  public String toString() {
    return "Transaction{" +
        "id='" + id + '\'' +
        ", amountFailed=" + amountFailed +
        ", amountSettled=" + amountSettled +
        ", createdAt=" + createdAt +
        ", customerId='" + customerId + '\'' +
        ", description='" + description + '\'' +
        ", metadata=" + metadata +
        '}';
  }
}
