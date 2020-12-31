package com.impactupgrade.integration.paymentspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.impactupgrade.integration.paymentspring.internal.DateJsonDeserializer;

import java.util.Date;
import java.util.Map;

public class Transaction implements AbstractModel {

  private String id;

  @JsonProperty("address_1")
  private String address1;
  @JsonProperty("address_2")
  private String address2;
  @JsonProperty("amount_failed")
  private Long amountFailed;
  @JsonProperty("amount_settled")
  private Long amountSettled;
  private String city;
  private String country;
  @JsonProperty("created_at")
  @JsonDeserialize(using = DateJsonDeserializer.class)
  private Date createdAt;
  @JsonProperty("customer_id")
  private String customerId;
  private String description;
  private String email;
  @JsonProperty("first_name")
  private String firstName;
  @JsonProperty("last_name")
  private String lastName;
  private String phone;
  private String state;
  private String zip;

  @JsonProperty("card_owner_name")
  private String cardOwnerName;
  @JsonProperty("account_holder_name")
  private String accountHolderName;

  private Map<String, String> metadata;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Long getAmountFailed() {
    return amountFailed;
  }

  public void setAmountFailed(Long amountFailed) {
    this.amountFailed = amountFailed;
  }

  public Long getAmountSettled() {
    return amountSettled;
  }

  public void setAmountSettled(Long amountSettled) {
    this.amountSettled = amountSettled;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public String getCardOwnerName() {
    return cardOwnerName;
  }

  public void setCardOwnerName(String cardOwnerName) {
    this.cardOwnerName = cardOwnerName;
  }

  public String getAccountHolderName() {
    return accountHolderName;
  }

  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }

  @Override
  public String toString() {
    return "Transaction{" +
        "id='" + id + '\'' +
        ", address1='" + address1 + '\'' +
        ", address2='" + address2 + '\'' +
        ", amountFailed=" + amountFailed +
        ", amountSettled=" + amountSettled +
        ", city='" + city + '\'' +
        ", country='" + country + '\'' +
        ", createdAt=" + createdAt +
        ", customerId='" + customerId + '\'' +
        ", description='" + description + '\'' +
        ", email='" + email + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", phone='" + phone + '\'' +
        ", state='" + state + '\'' +
        ", zip='" + zip + '\'' +
        ", cardOwnerName='" + cardOwnerName + '\'' +
        ", accountHolderName='" + accountHolderName + '\'' +
        ", metadata=" + metadata +
        '}';
  }
}
