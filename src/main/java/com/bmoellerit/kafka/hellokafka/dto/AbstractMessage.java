package com.bmoellerit.kafka.hellokafka.dto;

import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Bernd on 25.02.2020.
 * <p>
 * Package com.bmoellerit.kafka.hellokafka.dto
 */
public abstract class AbstractMessage {
  private static final Logger LOGGER = LoggerFactory.getLogger(AbstractMessage.class);
  private UUID messageId;
  private UUID correlationId;

  public AbstractMessage() {
    this(UUID.randomUUID(),UUID.randomUUID());
  }

  public AbstractMessage(UUID messageId, UUID correlationId) {
    this.messageId = messageId;
    this.correlationId = correlationId;
    LOGGER.debug("AbstractMessage created:" + this.toString());
  }

  public UUID getMessageId() {
    return messageId;
  }

  public void setMessageId(UUID messageId){
    this.messageId = messageId;
  }

  public UUID getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(UUID correlationId) {
    this.correlationId = correlationId;
  }


  public String toString(){
    return "MessageId: " + messageId.toString() + ", correlationId: " + correlationId.toString();
  }


}
