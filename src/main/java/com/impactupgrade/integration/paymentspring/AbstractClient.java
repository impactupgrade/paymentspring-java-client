package com.impactupgrade.integration.paymentspring;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import java.util.Base64;

public abstract class AbstractClient {

  protected final String bearerToken;

  protected final WebTarget target;
  protected final WebTarget targetv2;

  protected AbstractClient(String apiKey) {
    this.bearerToken = "Basic " + Base64.getEncoder().encodeToString((apiKey + ":" + apiKey).getBytes());

//    Logger logger = Logger.getLogger(this.getClass().getName());
//    Feature loggingFeature = new LoggingFeature(
//        logger, Level.FINE, LoggingFeature.Verbosity.PAYLOAD_TEXT, LoggingFeature.DEFAULT_MAX_ENTITY_SIZE);

    Client client = ClientBuilder.newBuilder()
//        .register(loggingFeature)
        .build();

    target = client.target("https://api.paymentspring.com/api/v1");
    targetv2 = client.target("https://api.paymentspring.com/api/v2");
  }
}
