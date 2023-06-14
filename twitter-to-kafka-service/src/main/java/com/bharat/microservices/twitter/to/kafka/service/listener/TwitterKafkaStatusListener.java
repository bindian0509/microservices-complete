package com.bharat.microservices.twitter.to.kafka.service.listener;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Saturday, 19 August 2023
 */

import com.bharat.microservices.config.KafkaConfigData;
import com.bharat.microservices.kafka.avro.model.TwitterAvroModel;
import com.bharat.microservices.kafka.producer.config.service.KafkaProducer;
import com.bharat.microservices.twitter.to.kafka.service.transformer.TwitterStatusToAvroTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import twitter4j.Status;
import twitter4j.StatusAdapter;


@Component
public class TwitterKafkaStatusListener extends StatusAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(TwitterKafkaStatusListener.class);

    private final KafkaConfigData kafkaConfigData;

    private final KafkaProducer<Long, TwitterAvroModel> kafkaProducer;

    private final TwitterStatusToAvroTransformer twitterStatusToAvroTransformer;

    public TwitterKafkaStatusListener(KafkaConfigData configData,
                                      KafkaProducer<Long, TwitterAvroModel> producer,
                                      TwitterStatusToAvroTransformer transformer) {
        this.kafkaConfigData = configData;
        this.kafkaProducer = producer;
        this.twitterStatusToAvroTransformer = transformer;
    }

    @Override
    public void onStatus(Status status) {
        LOG.info("Received status text ||-> {} <-|| sending to kafka topic ||-> {} <-||", status.getText(), kafkaConfigData.getTopicName());
        TwitterAvroModel twitterAvroModel = twitterStatusToAvroTransformer.getTwitterAvroModelFromStatus(status);
        kafkaProducer.send(kafkaConfigData.getTopicName(), twitterAvroModel.getUserId(), twitterAvroModel);
        LOG.info("Message Sent : 👍");
    }
}
