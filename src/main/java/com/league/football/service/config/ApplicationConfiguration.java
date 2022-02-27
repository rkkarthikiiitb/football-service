package com.league.football.service.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(
        basePackages = {"com.league.football.service"}
)
@Import({
        DataSourceAutoConfiguration.class
})
@EntityScan("com.league.football.service.entity")
@EnableJpaRepositories(basePackages = {"com.league.football.service.repository"})
@Configuration
public class ApplicationConfiguration {
}
