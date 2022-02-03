package com.hades.restaurantfoodservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PizzaOrder")
public class PizzaOrder {

    @Id
    @Column(name = "PizzaOrderId")
    private long pizzaOrderId;
    @Column(name = "FirstName")
    private String fname;
    @Column(name = "LastName")
    private String lname;
    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "PizzaType")
    private String pizzaType;
}
