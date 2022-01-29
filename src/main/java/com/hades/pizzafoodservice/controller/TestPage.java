package com.hades.pizzafoodservice.controller;

import com.hades.pizzafoodservice.models.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TestPage {

    @GetMapping(value = "/user", produces= MediaType.APPLICATION_JSON_VALUE)
    public User userInfo() {
        User user = new User("John", "Paul", 25, 130000, LocalDateTime.now());
        return user;
    }

    @PostMapping(value = "/user",consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public User userInfo(@RequestBody User user) {
        return user;
    }
}
