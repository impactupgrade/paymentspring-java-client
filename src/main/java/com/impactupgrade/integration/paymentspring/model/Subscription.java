package com.impactupgrade.integration.paymentspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.impactupgrade.integration.paymentspring.internal.DateJsonDeserializer;

import java.util.Date;

public class Subscription implements AbstractModel {

  private String id;

  private Long amount;
  @JsonProperty("created_at")
  @JsonDeserialize(using = DateJsonDeserializer.class)
  private Date createdAt;
  @JsonProperty("plan_id")
  private String planId;
  @JsonProperty("customer_id")
  private String customerId;
  private String frequency;

  // TODO: PS screwed this up in a recent update (empty values are coming through as "" instead of {}). Disabling for now...
//  private Map<String, String> metadata;

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

  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
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

//  public Map<String, String> getMetadata() {
//    return metadata;
//  }
//
//  public void setMetadata(Map<String, String> metadata) {
//    this.metadata = metadata;
//  }

  @Override
  public String toString() {
    return "Subscription{" +
        "id='" + id + '\'' +
        ", amount=" + amount +
        ", createdAt=" + createdAt +
        ", planId='" + planId + '\'' +
        ", customerId='" + customerId + '\'' +
        ", frequency='" + frequency + '\'' +
//        ", metadata=" + metadata +
        '}';
  }
}
