package com.chicken.strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        Chicken mallard = new MallardChicken();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Chicken model = new ModelChicken();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}