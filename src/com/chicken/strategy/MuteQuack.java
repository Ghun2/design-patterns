package com.chicken.strategy;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("조용#");
    }
}
