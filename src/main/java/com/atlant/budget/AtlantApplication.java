package com.atlant.budget;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// @SpringBootApplication adds all of the following
// @Configuration
// @EnableAutoConfiguration
// @ComponentScan
public class AtlantApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtlantApplication.class, args);
    }

    @Bean
    /* CommandLine runs on start up. It retrieves all the beans
     * that were created by your application
     * or that were automatically added by Spring Boot.
     * */
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            int beanNumber = ctx.getBeanDefinitionNames().length;
            System.out.println("Beans provided by Spring Boot inspected: " + beanNumber);
        };
    }
}
