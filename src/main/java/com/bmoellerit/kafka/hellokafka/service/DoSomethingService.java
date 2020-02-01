package com.bmoellerit.kafka.hellokafka.service;

import com.bmoellerit.kafka.hellokafka.integration.Messenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Bernd on 25.01.2020.
 * <p>
 * Package com.bmoellerit.kafka.hellokafka.service
 */
@Service
public class DoSomethingService {

  private Messenger messenger;

  @Autowired
  public DoSomethingService(Messenger messenger) {
    this.messenger = messenger;
  }

  public void send(String msg){
    messenger.sendMessage(msg);
  }
}
