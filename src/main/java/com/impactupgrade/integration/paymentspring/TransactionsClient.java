package com.impactupgrade.integration.paymentspring;

import com.impactupgrade.integration.paymentspring.model.Transaction;
import com.impactupgrade.integration.paymentspring.model.TransactionList;

import java.util.List;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class TransactionsClient extends AbstractClient {

  private final WebTarget transactionsTargetV1 = target.path("transactions");
  private final WebTarget transactionsTargetV2 = targetv2.path("transactions");

  public TransactionsClient(String apiKey) {
    super(apiKey);
  }

  public Transaction getByTransactionId(String id) {
    return transactionsTargetV1
        .path(id)
        .request(MediaType.APPLICATION_JSON)
        .header("Authorization", bearerToken)
        .get(Transaction.class);
  }

  public List<Transaction> getAllTransactions() {
    return transactionsTargetV1
        .queryParam("limit", "25") // I beleive these are set by default if not included. Could be wrong though
        .queryParam("offset", "0")
        .request(MediaType.APPLICATION_JSON)
        .header("Authorization", bearerToken)
        .get(TransactionList.class)
        .getList();
  }
}
