package org.example;

import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomOrderTest {
    @org.junit.jupiter.api.Test
    @DisplayName("Add numbers in a list")
    void getTotalPrice() {

        Food burger = new Burger();
        Food hotdog = new HotDog();
        Food fries = new Fries();

        Food burger_1 = new Burger();
        Food hotdog_1 = new HotDog();
        Food fries_1 = new Fries();

        burger_1 = new PattyDecorator(burger_1); //  1.5
        burger_1 = new PickleDecorator(burger_1); // 0.5
        burger_1 = new CheeseDecorator(burger_1); // 3.0

        hotdog_1 = new OnionDecorator(hotdog_1); // 0.25

        fries_1 = new CheeseDecorator(fries_1); // 3.0
        fries_1 = new ChiliDecorator(fries_1); // 2.0

        CustomOrder order1_test = new CustomOrder();
        order1_test.addItem(burger); // 7.25
        order1_test.addItem(fries); // 4.0

        CustomOrder order2_test = new CustomOrder();
        order2_test.addItem(burger); // 7.25
        order2_test.addItem(hotdog); // 3.0
        order2_test.addItem(fries); // 4.0

        CustomOrder order3_test = new CustomOrder();
        order3_test.addItem(burger_1);
        order3_test.addItem(hotdog_1);
        order3_test.addItem(fries_1);

        double expectedTotalPrice_1 = 7.25 + 4.0;
        double expectedTotalPrice_2  =  7.25 + 3.0 + 4.0;
        double expectedTotalPrice_3 = 7.25 + 1.5 + 0.5 + 3.0 + 3.0 + 0.25 + 4.0 + 3.0 + 2.0;

        assertEquals(expectedTotalPrice_1,  order1_test.getTotalPrice(), 0.001);
        assertEquals(expectedTotalPrice_2,  order2_test.getTotalPrice(), 0.001);
        assertEquals(expectedTotalPrice_3,  order3_test.getTotalPrice(), 0.001);
    }

}