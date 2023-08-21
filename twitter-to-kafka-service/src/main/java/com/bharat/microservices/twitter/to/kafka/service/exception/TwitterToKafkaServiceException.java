package com.bharat.microservices.twitter.to.kafka.service.exception;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Monday, 21 August 2023
 */
public class TwitterToKafkaServiceException extends RuntimeException {

    public TwitterToKafkaServiceException() {
        super();
    }

    public TwitterToKafkaServiceException(String message) {
        super(message);
    }

    public TwitterToKafkaServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}