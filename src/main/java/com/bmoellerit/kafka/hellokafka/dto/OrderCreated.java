package com.bmoellerit.kafka.hellokafka.dto;

import java.util.UUID;

/**
 * Created by Bernd on 08.02.2020.
 * <p>
 * Package com.bmoellerit.kafka.hellokafka.dto
 */
public class OrderCreated extends AbstractMessage {
  private String article;

  public static OrderCreated getOrderCreated(String article){
    return new OrderCreated(article);
  }

  public OrderCreated(){}

  public OrderCreated(String article) {
    super();
    this.article = article;
  }

  public String getArticle() {
    return article;
  }

  @Override
  public String toString() {
    return "OrderCreated{" +
        "messageId=" + getMessageId() +
        ", article='" + article + '\'' +
        '}';
  }
}
