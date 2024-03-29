package org.example;

public class LoyalStatus {
    private String status;
    private double new_price;
    private double discount;

    public LoyalStatus(String status){
        this.status = status;
    }

    public double applyDiscount(double price){
        switch (status) {
            case "Gold":
                discount = price * 0.3;
                new_price = price - discount;
                return new_price;
            case "Sliver":
                discount = price * 0.2;
                new_price = price - discount;
                return new_price;
            case "Bronze":
                discount = price * 0.1;
                new_price = price - discount;
                return new_price;
            default:
                return price;
        }
    }
}

