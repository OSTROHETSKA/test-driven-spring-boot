package com.xpinjection.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppWithExitApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AppWithExitApplication.class, args);
        // Close the application context to gracefully shut down the application
        SpringApplication.exit(context);
    }
}
