package com.hades.restaurantfoodservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.hades.restaurantfoodservice.entities", "com.hades.restaurantfoodservice.configurations"})
public class RestaurantFoodServiceApplication {

    public static final Logger logger = LoggerFactory.getLogger(RestaurantFoodServiceApplication.class);

    public static void main(String[] args) {
        logger.info("Start of RestaurantFoodServiceApplication");
        SpringApplication.run(RestaurantFoodServiceApplication.class, args);
        logger.info("End of RestaurantFoodServiceApplication");
    }

}
