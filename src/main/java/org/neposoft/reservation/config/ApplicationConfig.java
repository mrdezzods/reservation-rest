package org.neposoft.reservation.config;


import domain.AppFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("org.neposoft.reservation.controllers.")
public class ApplicationConfig {

    @Bean
    public AppFacade domainFacade() {
        return new AppFacade("database");
    }
}
