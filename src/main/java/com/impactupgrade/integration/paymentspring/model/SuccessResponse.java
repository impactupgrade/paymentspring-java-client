package com.impactupgrade.integration.paymentspring.model;

public class SuccessResponse implements AbstractModel {

  private Boolean success;

  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  @Override
  public String toString() {
    return "SuccessResponse{" +
        "success=" + success +
        '}';
  }
}
