package com.impactupgrade.integration.paymentspring;

import com.impactupgrade.integration.paymentspring.model.Subscription;
import com.impactupgrade.integration.paymentspring.model.SubscriptionList;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class SubscriptionsClient extends AbstractClient {

  private final WebTarget subscriptionsTarget = target.path("subscriptions");

  public SubscriptionsClient(String apiKey) {
    super(apiKey);
  }

  public Subscription getByPlanId(String planId, String customerId) {
    return subscriptionsTarget
        .path("plan").path(planId).path("customer").path(customerId)
        .request(MediaType.APPLICATION_JSON)
        .header("Authorization", bearerToken)
        .get(Subscription.class);
  }

  /**
   * If you don't have the Plan ID, PaymentSpring annoyingly doesn't have a simple by-subscription-id endpoint.
   * We instead have to query all subscriptions for a given customer, then filter in-memory.
   *
   * @param subscriptionId
   * @param customerId
   * @return Subscription
   */
  public Subscription getById(String subscriptionId, String customerId) {
    return subscriptionsTarget
        .path("customer").path(customerId)
        .request(MediaType.APPLICATION_JSON)
        .header("Authorization", bearerToken)
        .get(SubscriptionList.class)
        .getList()
        .stream()
        .filter(subscription -> subscriptionId.equalsIgnoreCase(subscription.getId()))
        .findFirst()
        .orElse(null);
  }
}
