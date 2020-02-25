package com.bmoellerit.kafka.hellokafka;

import com.bmoellerit.kafka.hellokafka.integration.Messenger;
import com.bmoellerit.kafka.hellokafka.service.DoSomethingService;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HellokafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellokafkaApplication.class, args);
	}

	@Bean
	public NewTopic berndsTopic(){
	  return new NewTopic("Bernds",2,(short)1);
  }

}


