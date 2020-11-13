package com.impactupgrade.integration.paymentspring.model;

import java.util.List;

public class TransactionList implements AbstractModel {

  private List<Transaction> list;

  public List<Transaction> getList() {
    return list;
  }

  public void setList(List<Transaction> list) {
    this.list = list;
  }

  @Override
  public String toString() {
    return "TransactionList{" +
        "list=" + list +
        '}';
  }
}
