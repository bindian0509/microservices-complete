package com.bharat.microservices.twitter.to.kafka.service.runner;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Saturday, 19 August 2023
 */

import twitter4j.TwitterException;

public interface StreamRunner {
    void start() throws TwitterException;
}

