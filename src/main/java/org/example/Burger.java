package org.example;

public class Burger implements Food {
    @Override
    public String foodName() {
        return "Burger";
    }

    @Override
    public double price() {
        return 7.25;
    }

}