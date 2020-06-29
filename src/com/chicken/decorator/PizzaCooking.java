package com.chicken.decorator;

public class PizzaCooking {
    public static void main(String args[]) {
        Pizza pizza1 = new Napolitana();
        System.out.println(pizza1.getDescription() + " $" + pizza1.cost());

        Pizza pizza2 = new Margherita();
        pizza2 = new Cheese(pizza2);
        pizza2 = new Pepperoni(pizza2);
        pizza2 = new Mushrooms(pizza2);
        System.out.println(pizza2.getDescription() + " $" + pizza2.cost());
    }
}
