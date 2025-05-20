package org.example.structural.decorateur;

// pizza de base sans garniture qui respecte min interface

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Pizza de base";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
