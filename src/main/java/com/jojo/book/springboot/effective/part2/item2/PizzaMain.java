package com.jojo.book.springboot.effective.part2.item2;

import static com.jojo.book.springboot.effective.part2.item2.NyPizza.Size.*;
import static com.jojo.book.springboot.effective.part2.item2.Pizza.Topping.*;

public class PizzaMain {

    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();

        System.out.println("피자!");
        System.out.println(pizza);
        System.out.println(calzone);
    }
}
