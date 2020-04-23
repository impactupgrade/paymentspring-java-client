package com.impactupgrade.integration.paymentspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.impactupgrade.integration.paymentspring.internal.SubscriptionDateJsonDeserializer;

import java.util.Date;
import java.util.Map;

public class Subscription implements AbstractModel {

  private String id;

  private Long amount;
  @JsonProperty("created_at")
  @JsonDeserialize(using = SubscriptionDateJsonDeserializer.class)
  private Date createdAt;
  @JsonProperty("customer_id")
  private String customerId;
  private String frequency;

  private Map<String, String> metadata;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
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

  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  @Override
  public String toString() {
    return "Subscription{" +
        "id='" + id + '\'' +
        ", amount=" + amount +
        ", createdAt=" + createdAt +
        ", customerId='" + customerId + '\'' +
        ", frequency='" + frequency + '\'' +
        ", metadata=" + metadata +
        '}';
  }
}
