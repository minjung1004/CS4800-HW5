package src.Decorator;

public class ChiliDecorator extends FoodDecorator {
    public ChiliDecorator(Food hotdog) {
        super(hotdog);
    }

    @Override
    public String foodName() {
        return decoratedFood.foodName() + " {Chili}";
    }

    @Override
    public double price() {
        return decoratedFood.price() + 2.0;
    }

}
