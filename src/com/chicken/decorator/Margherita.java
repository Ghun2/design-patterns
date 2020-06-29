package com.chicken.decorator;

public class Margherita extends Pizza {
    public Margherita() {
        description = "마르게리타 피자";
    }

    public double cost() {
        return 1.65;
    }
}
