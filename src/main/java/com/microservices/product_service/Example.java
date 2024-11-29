package com.microservices.product_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example {
    private static final Logger logger = LoggerFactory.getLogger(Example.class);

    public static void main(String[] args) {
        logger.info("Application started");
        logger.debug("Processing data: {}", "exampleData");
        try {
            int result = 10 / 0; // Will cause an exception
        } catch (Exception e) {
            logger.error("An error occurred", e);
        }
    }
}
