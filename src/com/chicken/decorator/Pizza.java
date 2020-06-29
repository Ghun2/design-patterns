package com.chicken.decorator;

public abstract class Pizza {
    String description = "No Name";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
