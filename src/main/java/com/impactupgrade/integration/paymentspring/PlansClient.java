package com.impactupgrade.integration.paymentspring;

import com.impactupgrade.integration.paymentspring.model.SuccessResponse;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class PlansClient extends AbstractClient {

  private final WebTarget plansTarget = target.path("plans");

  public PlansClient(String apiKey) {
    super(apiKey);
  }

  public SuccessResponse unsubscribe(String planId, String customerId) {
    return plansTarget
        .path(planId).path("subscription").path(customerId)
        .request(MediaType.APPLICATION_JSON)
        .header("Authorization", bearerToken)
        .delete(SuccessResponse.class);
  }
}
