package com.example.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SwaggerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerServerApplication.class, args);
    }
}
