package com.chicken.decorator;

public class Napolitana extends Pizza {
    public Napolitana() {
        description = "나폴리 피자";
    }

    public double cost() {
        return 1.99;
    }
}
