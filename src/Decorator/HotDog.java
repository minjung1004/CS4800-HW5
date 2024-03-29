package src.Decorator;

public class HotDog implements Food{
    @Override
    public String foodName() {
        return "Hot Dog";
    }

    @Override
    public double price() {
        return 3.0;
    }
}
