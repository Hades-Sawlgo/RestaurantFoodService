package com.hades.restaurantfoodservice.exceptions;

public class PizzaException extends Exception{

    private static final String exceptionMessage = "This is a temporary exception!";

    public PizzaException() {
        super(exceptionMessage, null, true, false);
    }

    public PizzaException(String errorMessage) {
        super(errorMessage, null, true, false);
    }

}
