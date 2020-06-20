package com.chicken.strategy;

public class MallardChicken extends Chicken {
    public MallardChicken() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("저는 물치킨입니다.");
    }
}
