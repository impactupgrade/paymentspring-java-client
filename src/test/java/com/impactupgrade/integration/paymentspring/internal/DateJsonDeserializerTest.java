package com.impactupgrade.integration.paymentspring.internal;

import com.fasterxml.jackson.core.JsonParser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@RunWith(MockitoJUnitRunner.class)
public class DateJsonDeserializerTest {

  @Mock
  private JsonParser jsonParser;

  @Test
  public void deserializeTest() throws IOException {
    Mockito.when(jsonParser.getText()).thenReturn("2020-12-31 01:02:03 UTC");

    DateJsonDeserializer deserializer = new DateJsonDeserializer();
    Date d = deserializer.deserialize(jsonParser, null);
    Calendar c = Calendar.getInstance();
    c.setTime(d);
    c.setTimeZone(TimeZone.getTimeZone("EST"));
    Assert.assertEquals(2020, c.get(Calendar.YEAR));
    Assert.assertEquals(11, c.get(Calendar.MONTH)); // MONTH is 0 based, because reasons.
    Assert.assertEquals(30, c.get(Calendar.DATE)); // 30th since we're pulling back to EST.
  }
}
