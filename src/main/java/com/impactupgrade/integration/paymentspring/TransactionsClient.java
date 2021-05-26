package com.impactupgrade.integration.paymentspring;

import com.impactupgrade.integration.paymentspring.model.Transaction;
import com.impactupgrade.integration.paymentspring.model.TransactionList;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

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

  public List<Transaction> getTransactionsBetweenDates(String startDate, String endDate) {
    return getTransactionsBetweenDates(startDate, endDate, 100, 1);
  }

  private List<Transaction> getTransactionsBetweenDates(String startDate, String endDate, int limit, int page) {
    Form form = new Form();
    form.param("start_date", startDate).param("end_date", endDate);
    
    Response response = transactionsTargetV2
        .path("search")
        .queryParam("page", page) // page number sets the offset: with limit 100, page=1 returns transactions 0-99, page=2 returns 100-199, etc...
        .queryParam("limit", limit)
        .request(MediaType.APPLICATION_JSON)
        .header(HttpHeaders.AUTHORIZATION, bearerToken)
        .post(Entity.form(form));

    TransactionList transactionList = response.readEntity(TransactionList.class);
    List<Transaction> transactions = transactionList.getList();

    // Number of pages needed
    int totalResults = transactionList.getMeta().getTotalResults();
    int totalPages = (totalResults / limit) + 1;

    // If more pages need to get all possible results, recursive call
    if (page <= totalPages) {
      transactions.addAll(getTransactionsBetweenDates(startDate, endDate, limit, page + 1));
    }

    return transactions;
  }
}
