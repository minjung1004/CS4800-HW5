package src.Decorator;
import java.util.List;
import java.util.ArrayList;

public class CustomOrder {
    private List<Food> items = new ArrayList<>();

    public void addItem(Food item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for(Food item : items) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void printOrder() {
        System.out.println("Order: ");
        for(Food item : items) {
            System.out.println("- " + item.foodName());
        }
    }
}
