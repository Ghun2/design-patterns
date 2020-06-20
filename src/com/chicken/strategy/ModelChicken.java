package com.chicken.strategy;

public class ModelChicken extends Chicken {
    public ModelChicken() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("저는 모형 닭 입니다.");
    }
}
