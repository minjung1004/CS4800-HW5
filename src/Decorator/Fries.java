package src.Decorator;

public class Fries implements Food{
    @Override
    public String foodName() {
        return "Fries";
    }

    @Override
    public double price() {
        return 4.0;
    }

}
