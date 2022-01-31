package com.hades.pizzafoodservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzaFoodServiceApplication {

    public static final Logger logger = LoggerFactory.getLogger(PizzaFoodServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PizzaFoodServiceApplication.class, args);
    }

}
