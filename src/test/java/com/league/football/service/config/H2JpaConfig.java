package com.league.football.service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application-test-h2.yaml")
public class H2JpaConfig {
}
