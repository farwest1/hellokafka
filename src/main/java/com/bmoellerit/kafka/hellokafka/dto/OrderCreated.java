package com.bmoellerit.kafka.hellokafka.dto;

import java.util.UUID;

/**
 * Created by Bernd on 08.02.2020.
 * <p>
 * Package com.bmoellerit.kafka.hellokafka.dto
 */
public class OrderCreated {
  private  UUID id;
  private String article;

  public static OrderCreated getOrderCreated(UUID id, String article){
    return new OrderCreated(id,article);
  }

  public OrderCreated(){

  }

  public OrderCreated(UUID id, String article) {
    this.id = id;
    this.article = article;
  }

  public UUID getId() {
    return id;
  }


  public String getArticle() {
    return article;
  }

  @Override
  public String toString() {
    return "OrderCreated{" +
        "id=" + id +
        ", article='" + article + '\'' +
        '}';
  }
}
