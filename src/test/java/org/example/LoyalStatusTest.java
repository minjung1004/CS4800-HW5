package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoyalStatusTest {
    @org.junit.jupiter.api.Test
    void testApplyDiscountGold() {
        LoyalStatus loyalStatus_1 = new LoyalStatus("Gold");
        double price = 100.0;
        double discountedPrice = loyalStatus_1.applyDiscount(price);
        assertEquals(70.0, discountedPrice, 0.001);
    }

    @org.junit.jupiter.api.Test
    void testApplyDiscountSliver() {
        LoyalStatus loyalStatus_1 = new LoyalStatus("Sliver");
        double price = 100.0;
        double discountedPrice = loyalStatus_1.applyDiscount(price);
        assertEquals(80.0, discountedPrice, 0.001);
    }

    @org.junit.jupiter.api.Test
    void testApplyDiscountBronze() {
        LoyalStatus loyalStatus_1 = new LoyalStatus("Bronze");
        double price = 100.0;
        double discountedPrice = loyalStatus_1.applyDiscount(price);
        assertEquals(90.0, discountedPrice, 0.001);
    }

}