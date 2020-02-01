package com.bmoellerit.kafka.hellokafka.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by Bernd on 25.01.2020.
 * <p>
 * Package com.bmoellerit.kafka.hellokafka.integration
 */
@Component
public class Messenger {


  private final KafkaTemplate kafkaTemplate;

  @Autowired
  public Messenger(KafkaTemplate kafkaTemplate){
    this.kafkaTemplate = kafkaTemplate;
  }

  public void sendMessage(String msg) {
    kafkaTemplate.send("Bernds", msg);
  }



}