package com.hades.restaurantfoodservice.repositories;

import com.hades.restaurantfoodservice.entities.PizzaOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PizzaRepository extends JpaRepository<PizzaOrder, Long> {

    @Query(value = "SELECT * FROM PizzaOrder WHERE PizzaOrderId = ?1", nativeQuery = true)
    PizzaOrder getSpecificID(Long pizzaOrderId);

    @Override
    List<PizzaOrder> findAll();

    @Modifying
    @Transactional
    @Query(value = "UPDATE PizzaOrder " +
            "SET FirstName = ?2, LastName = ?3, PhoneNumber = ?4, PizzaType = ?5" +
            " WHERE PizzaOrderId = ?1", nativeQuery = true)
    void updateById(long pizzaOrderId, String fname, String lname, String phoneNumber, String pizzaType);

    @Override
    void deleteById(Long pizzaOrderId);
}
