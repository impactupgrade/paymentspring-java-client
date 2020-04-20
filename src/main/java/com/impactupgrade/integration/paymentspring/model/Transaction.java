package com.impactupgrade.integration.paymentspring.model;

import java.util.Map;

public class Transaction implements AbstractModel {

  private String id;
  private Map<String, String> metadata;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }
}
