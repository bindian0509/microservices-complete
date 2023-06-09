package com.bharat.microservices.twitter.to.kafka.service.transformer;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Saturday, 02 September 2023
 */

import com.bharat.microservices.kafka.avro.model.TwitterAvroModel;
import org.springframework.stereotype.Component;
import twitter4j.Status;

@Component
public class TwitterStatusToAvroTransformer {

    public TwitterAvroModel getTwitterAvroModelFromStatus(Status status) {
        return TwitterAvroModel
                .newBuilder()
                .setId(status.getId())
                .setUserId(status.getUser().getId())
                .setText(status.getText())
                .setCreatedAt(status.getCreatedAt().getTime())
                .build();
    }
}
