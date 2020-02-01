package com.bmoellerit.kafka.hellokafka.controller;

import com.bmoellerit.kafka.hellokafka.service.DoSomethingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bernd on 26.01.2020.
 * <p>
 * Package com.bmoellerit.kafka.hellokafka.controller
 */

@RestController
public class MessageController {

  private final DoSomethingService doSomethingService;
  private static final Logger LOGGER = LoggerFactory.getLogger(MessageController.class);

  @Autowired
  public MessageController(DoSomethingService doSomethingService){
    this.doSomethingService = doSomethingService;
  }

  @RequestMapping(value = "/send")
  public void sendMessage(){
    LOGGER.info("Send Message");
    doSomethingService.send("Blablabla");
  }
}
