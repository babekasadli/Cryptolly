package com.cryptolly.backend;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
public class BackendApplication {
    private static final Logger logger = LogManager.getLogger(BackendApplication.class);

    public static void main(String[] args) {
        logger.info("Starting the backend application");
        SpringApplication.run(BackendApplication.class, args);
    }
}
