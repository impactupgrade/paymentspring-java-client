package com.impactupgrade.integration.paymentspring.model;

import java.util.List;

public class SubscriptionList implements AbstractModel {

  private List<Subscription> list;

  public List<Subscription> getList() {
    return list;
  }

  public void setList(List<Subscription> list) {
    this.list = list;
  }

  @Override
  public String toString() {
    return "SubscriptionList{" +
        "list=" + list +
        '}';
  }
}
