package com.impactupgrade.integration.paymentspring.internal;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SubscriptionDateJsonDeserializer extends JsonDeserializer<Date> {

  private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

  @Override
  public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
    String date = jsonParser.getText();
    try {
      return SDF.parse(date);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }
}
