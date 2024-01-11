package com.xpinjection.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AppWithExitApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AppWithExitApplication.class, args);
        // Close the application context to gracefully shut down the application
        SpringApplication.exit(context);
    }
}

@RestController
class AppController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

}