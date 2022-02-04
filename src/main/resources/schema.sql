DROP TABLE IF EXISTS PizzaOrder CASCADE;

CREATE TABLE PizzaOrder (
    PizzaOrderId BIGINT NOT NULL,
    FirstName VARCHAR(255),
    LastName VARCHAR(255),
    PhoneNumber VARCHAR(255),
    PizzaType VARCHAR(255),
    PRIMARY KEY (PizzaOrderId)
)