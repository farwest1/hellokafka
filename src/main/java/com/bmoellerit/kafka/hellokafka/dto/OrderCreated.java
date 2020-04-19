package com.bmoellerit.kafka.hellokafka.dto;

/**
 * Created by Bernd on 08.02.2020.
 * <p>
 * Package com.bmoellerit.kafka.hellokafka.dto
 */
public class OrderCreated extends DomainEvent {
  private String article;
  private String articleClass;

  public static OrderCreated getOrderCreated(String article, String articleClass){
    return new OrderCreated(article, articleClass);
  }

  public OrderCreated(){}

  public OrderCreated(String article, String articleClass) {
    super();
    this.article = article;
    this.articleClass = articleClass;
  }

  public String getArticle() {
    return article;
  }

  public String getArticleClass() {
    return articleClass;
  }

  @Override
  public String toString() {
    return "OrderCreated{" +
        "messageId=" + getMessageId() +
        ", article='" + article + '\'' +
        ", articleClass='" + articleClass + '\'' +
        '}';
  }
}
