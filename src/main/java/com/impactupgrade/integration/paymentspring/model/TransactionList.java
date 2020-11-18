package com.impactupgrade.integration.paymentspring.model;

import java.util.List;
public class TransactionList implements AbstractModel {

  private List<Transaction> list;

  private Meta meta;

  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  public List<Transaction> getList() {
    return list;
  }

  public void setList(List<Transaction> list) {
    this.list = list;
  }

  @Override
  public String toString() {
    return "TransactionList{" +
        "list=" + list + ", meta=" + meta +
        '}';      
  }
}
