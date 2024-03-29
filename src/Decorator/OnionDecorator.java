package src.Decorator;

public class OnionDecorator extends FoodDecorator {
    public OnionDecorator(Food hotdog) {
        super(hotdog);
    }

    @Override
    public String foodName() {
        return decoratedFood.foodName() + " {Onion}";
    }

    @Override
    public double price() {
        return decoratedFood.price() + 0.25;
    }

}
