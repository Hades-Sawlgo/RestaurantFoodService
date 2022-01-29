package com.hades.pizzafoodservice;

import com.hades.pizzafoodservice.models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class PizzaFoodServiceApplicationTests {

    @Test
    void contextLoads() {}

    @Test
    void coverageTest() {
        LocalDateTime localDateTime = LocalDateTime.now();
        User user = new User("John","Cena", 56, 120000, localDateTime);
        user.setAge(66);

        Assertions.assertEquals(user.getAge(),66);
    }

}
