package com.impactupgrade.integration.paymentspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {
  private int limit;
  private int offset;
  @JsonProperty("total_results")
  private int totalResults;

  public int getLimit() {
    return limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  public int getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(int totalResults) {
    this.totalResults = totalResults;
  }

  @Override
  public String toString() {
    return "{" + 
        "limit=" + limit + ", offset=" + offset + ", totalResults=" + totalResults +
        '}';
  }
}
