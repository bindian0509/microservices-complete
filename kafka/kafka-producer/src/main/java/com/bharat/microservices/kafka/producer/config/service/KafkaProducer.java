package com.bharat.microservices.kafka.producer.config.service;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Saturday, 02 September 2023
 */

import org.apache.avro.specific.SpecificRecordBase;

import java.io.Serializable;

public interface KafkaProducer<K extends Serializable, V extends SpecificRecordBase> {
    void send(String topicName, K key, V message);
}
