package com.hades.restaurantfoodservice.services;

import com.hades.restaurantfoodservice.entities.PizzaOrder;
import com.hades.restaurantfoodservice.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaOrdersService {

    PizzaRepository pizzaOrders;

    public PizzaOrdersService(@Autowired PizzaRepository pizzaOrders) {
        this.pizzaOrders = pizzaOrders;
    }

    public List<PizzaOrder> findAll() {
        List<PizzaOrder> pizzaOrderList = new ArrayList<>();

        pizzaOrders.findAll().forEach(pizzaOrderList::add);
        return pizzaOrderList;
    }
}
