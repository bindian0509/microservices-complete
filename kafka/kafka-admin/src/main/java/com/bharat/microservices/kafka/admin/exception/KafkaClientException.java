package com.bharat.microservices.kafka.admin.exception;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Saturday, 02 September 2023
 */
public class KafkaClientException extends RuntimeException {

    public KafkaClientException() {
    }

    public KafkaClientException(String message) {
        super(message);
    }

    public KafkaClientException(String message, Throwable cause) {
        super(message, cause);
    }
}

