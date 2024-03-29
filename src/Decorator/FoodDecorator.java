package src.Decorator;

abstract class FoodDecorator implements Food{

    protected Food decoratedFood;

    public FoodDecorator(Food food){
        this.decoratedFood = food;
    }
}
