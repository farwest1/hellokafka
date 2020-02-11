package com.bmoellerit.kafka.hellokafka.integration;

import com.bmoellerit.kafka.hellokafka.dto.OrderCreated;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import org.apache.kafka.common.serialization.Deserializer;

/**
 * Created by Bernd on 09.02.2020.
 * <p>
 * Package com.bmoellerit.kafka.hellokafka.integration
 */
public class JsonDeserializer implements Deserializer {

  @Override
  public void configure(Map configs, boolean isKey) {

  }

  @Override
  public void close() {

  }

  @Override
  public Object deserialize(String s, byte[] bytes) {
    ObjectMapper mapper = new ObjectMapper();
    OrderCreated orderCreated = null;
    try {
      orderCreated = mapper.readValue(bytes, OrderCreated.class);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return orderCreated;
  }
}
