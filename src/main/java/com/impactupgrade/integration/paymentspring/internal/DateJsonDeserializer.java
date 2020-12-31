package com.impactupgrade.integration.paymentspring.internal;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateJsonDeserializer extends JsonDeserializer<Date> {

  @Override
  public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
    String s = jsonParser.getText();

    // PaymentSpring continues to change the datetime structure for fun, at will :(

    try {
      return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(s);
    } catch (ParseException e) {
      // do nothing
    }

    try {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss 'UTC'");
      sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
      return sdf.parse(s);
    } catch (ParseException e) {
      // do nothing
    }

    throw new RuntimeException("unable to parse datetime from PaymentSpring: " + s);
  }
}
