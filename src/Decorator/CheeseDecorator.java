package src.Decorator;

public class CheeseDecorator extends FoodDecorator{
    public CheeseDecorator(Food food) {
        super(food);
    }

    @Override
    public String foodName() {
        return decoratedFood.foodName();
    }

    @Override
    public double price() {
        return decoratedFood.price() + 3.0;
    }

}
