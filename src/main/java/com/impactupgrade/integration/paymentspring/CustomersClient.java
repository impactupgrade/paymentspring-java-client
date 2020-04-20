package com.impactupgrade.integration.paymentspring;

import com.impactupgrade.integration.paymentspring.model.Customer;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class CustomersClient extends AbstractClient {

  private final WebTarget customersTarget = target.path("customers");

  public CustomersClient(String apiKey) {
    super(apiKey);
  }

  public Customer getById(String id) {
    return customersTarget
        .path(id)
        .request(MediaType.APPLICATION_JSON)
        .header("Authorization", bearerToken)
        .get(Customer.class);
  }
}
