package com.impactupgrade.integration.paymentspring;

import com.impactupgrade.integration.paymentspring.model.Subscription;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class SubscriptionsClient extends AbstractClient {

  private final WebTarget customersTarget = target.path("subscriptions");

  public SubscriptionsClient(String apiKey) {
    super(apiKey);
  }

  public Subscription getByPlanId(String planId, String customerId) {
    return customersTarget
        .path("plan").path(planId).path("customer").path(customerId)
        .request(MediaType.APPLICATION_JSON)
        .header("Authorization", bearerToken)
        .get(Subscription.class);
  }
}
