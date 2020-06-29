package com.chicken.decorator;

public class Pepperoni extends CondimentDecorator {
    Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", 페퍼로";
    }

    public double cost() {
        return 1.10 + pizza.cost();
    }
}
