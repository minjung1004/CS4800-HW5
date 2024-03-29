package org.example;

abstract class FoodDecorator implements Food{

    protected Food decoratedFood;

    public FoodDecorator(Food food){
        this.decoratedFood = food;
    }
}
