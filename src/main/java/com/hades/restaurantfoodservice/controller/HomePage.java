package com.hades.restaurantfoodservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomePage {

    @RequestMapping(value = "/home", method= RequestMethod.GET, params = {"name"})
    public String homePage(@RequestParam(name = "name", required=false, defaultValue = "John") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }
}
