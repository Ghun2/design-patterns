package com.chicken.strategy;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("저는 못날아요 ㅠㅠ");
    }
}
