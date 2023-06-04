package com.bharat.microservices.kafka.admin.config;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Saturday, 02 September 2023
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    WebClient webClient() {
        return WebClient.builder().build();
    }
}

