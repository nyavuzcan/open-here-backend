package com.openhere.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.openhere.*"})
@EnableMongoRepositories(basePackages = {"com.openhere.*"})
public class SpringRootApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
    SpringApplication.run(SpringRootApp.class, args);

    }


}
