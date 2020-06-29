package com.chicken.decorator;

public class Cheese extends CondimentDecorator {
    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", 치즈";
    }

    public double cost() {
        return .20 + pizza.cost();
    }
}
