package com.bmoellerit.kafka.hellokafka.integration;

import com.bmoellerit.kafka.hellokafka.dto.OrderCreated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by Bernd on 26.01.2020.
 * <p>
 * Package com.bmoellerit.kafka.hellokafka.integration
 */
@Component
public class Receiver {
  private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

  @KafkaListener(topics = "Bernds",groupId = "myGroup")
  public void processMessage(OrderCreated content) {
    LOGGER.info("Received message: " + content);
  }

}
