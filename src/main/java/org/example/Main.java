package org.example;

public class Main {
    public static void main(String[] args) {

        Food burger = new Burger();
        Food hotdog = new HotDog();
        Food fries = new Fries();

        burger = new PattyDecorator(burger);
        burger = new PickleDecorator(burger);

        hotdog = new PickleDecorator(hotdog);
        hotdog = new ChiliDecorator(hotdog);
        hotdog = new OnionDecorator(hotdog);

        fries = new CheeseDecorator(fries);
        fries = new ChiliDecorator(fries);

        CustomOrder order1 = new CustomOrder();
        order1.addItem(burger);
        order1.addItem(fries);

        CustomOrder order2 = new CustomOrder();
        order2.addItem(hotdog);
        order2.addItem(fries);

        CustomOrder order3 = new CustomOrder();
        order3.addItem(burger);
        order3.addItem(hotdog);
        order3.addItem(fries);

        LoyalStatus loyalStatus_1 = new LoyalStatus("Gold");
        double discountPrice_1 = order1.getTotalPrice();
        discountPrice_1 = loyalStatus_1.applyDiscount(discountPrice_1);

        LoyalStatus loyalStatus_2 = new LoyalStatus("Sliver");
        double discountPrice_2 = order2.getTotalPrice();
        discountPrice_2 = loyalStatus_2.applyDiscount(discountPrice_2);

        LoyalStatus loyalStatus_3 = new LoyalStatus("Bronze");
        double discountPrice_3 = order3.getTotalPrice();
        discountPrice_3 = loyalStatus_3.applyDiscount(discountPrice_3);

        System.out.println("Customer 1");
        order1.printOrder();
        System.out.println("Price: $" + order1.getTotalPrice());
        System.out.println("Loyalty: Gold (30% off)");
        System.out.println("Final cost: $" + discountPrice_1);

        System.out.println("\nCustomer 2");
        order2.printOrder();
        System.out.println("Price: $" + order2.getTotalPrice());
        System.out.println("Loyalty: Sliver (20% off)");
        System.out.println("Final cost: $" + discountPrice_2);

        System.out.println("\nCustomer 3");
        order3.printOrder();
        System.out.println("Price: $" + order3.getTotalPrice());
        System.out.println("Loyalty: Bronze (10% off)");
        System.out.println("Final cost: $" + discountPrice_3);

    }
}
