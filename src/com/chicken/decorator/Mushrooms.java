package com.chicken.decorator;

public class Mushrooms extends CondimentDecorator {
    Pizza pizza;

    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", 버섯";
    }

    public double cost() {
        return .80 + pizza.cost();
    }
}
