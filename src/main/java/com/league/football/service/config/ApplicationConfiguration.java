package com.league.football.service.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ComponentScan(
        basePackages = {"com.league.football.service"}
)
@Import({
        DataSourceAutoConfiguration.class
})
@Configuration
public class ApplicationConfiguration {
}
