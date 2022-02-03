package com.hades.restaurantfoodservice.configurations;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class JPAConfiguration {

    @Primary
    @Bean
    public DataSource getDataSource() {
        //Configures Dynamic Bean Creation for H2 DataSource.
        return DataSourceBuilder.create()
                    .driverClassName("org.h2.Driver")
                    .url("jdbc:h2:./data/demo")
                    .username("sa")
                    .password("password")
                    .build();
    }
}
