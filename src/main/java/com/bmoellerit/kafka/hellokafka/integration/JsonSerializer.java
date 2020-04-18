package com.bmoellerit.kafka.hellokafka.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import org.apache.kafka.common.serialization.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Bernd on 08.02.2020.
 * <p>
 * Package com.bmoellerit.kafka.hellokafka.dto
 */
public class JsonSerializer implements Serializer {
  private static final Logger LOGGER = LoggerFactory.getLogger(JsonSerializer.class);

  @Override
  public void configure(Map configs, boolean isKey) {
    
  }

  @Override
  public void close() {

  }

  @Override
  public byte[] serialize(String s, Object o) {
    byte[] retVal = null;
    LOGGER.info("String parameter:" + s);
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      retVal = objectMapper.writeValueAsString(o).getBytes();
    } catch (Exception e) {
      e.printStackTrace();
    }
    LOGGER.info(retVal.toString());
    return retVal;
  }
}
