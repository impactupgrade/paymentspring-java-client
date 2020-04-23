package com.impactupgrade.integration.paymentspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event implements AbstractModel {

  @JsonProperty("event_resource")
  private String eventResource;
  @JsonProperty("event_type")
  private String eventType;
  @JsonProperty("payload")
  private String payloadJson;

  public String getEventResource() {
    return eventResource;
  }

  public void setEventResource(String eventResource) {
    this.eventResource = eventResource;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public String getPayloadJson() {
    return payloadJson;
  }

  public void setPayloadJson(String payloadJson) {
    this.payloadJson = payloadJson;
  }

  @Override
  public String toString() {
    return "Event{" +
        "eventResource='" + eventResource + '\'' +
        ", eventType='" + eventType + '\'' +
        ", payloadJson='" + payloadJson + '\'' +
        '}';
  }
}
