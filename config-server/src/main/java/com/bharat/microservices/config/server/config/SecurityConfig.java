package com.bharat.microservices.config.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Wednesday, 13 September 2023
 */

@Configuration
public class SecurityConfig {

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().requestMatchers(
                "/encrypt/**",
                "/decrypt/**",
                "/actuator/**"
        );
    }

}

