package com.impactupgrade.integration.paymentspring.internal;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionDateJsonDeserializer  extends JsonDeserializer<Date> {

  // TODO: test and make sure UTC works
  private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");

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
