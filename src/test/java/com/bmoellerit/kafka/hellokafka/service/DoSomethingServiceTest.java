package com.bmoellerit.kafka.hellokafka.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by Bernd on 25.01.2020.
 * <p>
 * Package com.bmoellerit.kafka.hellokafka.service
 */
@SpringBootTest
class DoSomethingServiceTest {

  @Autowired
  private DoSomethingService doSomethingService;



  @Test
  void send() {
    doSomethingService.send("Bla","Blabla");
  }
}