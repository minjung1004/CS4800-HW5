package src.Decorator;

import src.Decorator.Food;

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