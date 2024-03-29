package org.example;

public class PattyDecorator extends FoodDecorator{
    public PattyDecorator(Food burger) {
        super(burger);
    }

    @Override
    public String foodName() {
        return decoratedFood.foodName() + " {Extra Patty}";
    }

    @Override
    public double price() {
        return decoratedFood.price() + 1.5;
    }

}
