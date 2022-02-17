package com.hades.restaurantfoodservice.controllers;

import com.hades.restaurantfoodservice.entities.PizzaOrder;
import com.hades.restaurantfoodservice.exceptions.PizzaException;
import com.hades.restaurantfoodservice.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PizzaOrderController{

    PizzaRepository pizzaRepository;

    public PizzaOrderController(@Autowired PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @GetMapping(value = "/getPizzaOrders")
    public List<PizzaOrder> getPizzaOrders() throws PizzaException {
        return pizzaRepository.findAll();
    }

    @GetMapping(value = "/getPizzaOrder")
    public PizzaOrder getPizzaOrder(@RequestParam Long pizzaOrderID) throws PizzaException {
        return pizzaRepository.getSpecificID(pizzaOrderID);
    }

    @PatchMapping(value = "/updatePizzaOrder", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePizzaOrder(@RequestBody PizzaOrder pizzaOrder) {
        pizzaRepository.updateById(
                pizzaOrder.getPizzaOrderId(), pizzaOrder.getFname(), pizzaOrder.getLname(), pizzaOrder.getPhoneNumber(), pizzaOrder.getPizzaType());
    }


    @DeleteMapping(value = "/deletePizzaOrder")
    public void deletePizzaOrder(@RequestParam Long pizzaOrderID) throws PizzaException {
        pizzaRepository.deleteById(pizzaOrderID);
    }
}
