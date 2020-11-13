package com.impactupgrade.integration.paymentspring;

public class PaymentSpringClient {

  private final String apiKey;

  public PaymentSpringClient(String apiKey) {
    this.apiKey = apiKey;
  }

  public CustomersClient customers() {
    return new CustomersClient(apiKey);
  }

  public SubscriptionsClient subscriptions() {
    return new SubscriptionsClient(apiKey);
  }

  public PlansClient plans() {
    return new PlansClient(apiKey);
  }

  public TransactionsClient transactions() {
    return new TransactionsClient(apiKey);
  }
}
