package com.hades.pizzafoodservice.controller;

import com.hades.pizzafoodservice.models.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestPage {

    @GetMapping(value = "/user", produces= MediaType.APPLICATION_JSON_VALUE)
    public User userInfo() {
        User user = new User("Georgiy", "Balyuk", 22, 70000);
        return user;
    }
}
