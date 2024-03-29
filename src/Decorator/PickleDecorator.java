package src.Decorator;

public class PickleDecorator extends FoodDecorator {
    public PickleDecorator(Food burger) {
        super(burger);
    }

    @Override
    public String foodName() {
        return decoratedFood.foodName() + " {Pickles}";
    }

    @Override
    public double price() {
        return decoratedFood.price() + 0.5;
    }

}

