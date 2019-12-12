package jp.ekata;

import jp.ekata.ducks.MallardDuck;
import jp.ekata.implementations.fly.FlyWithNoWings;

public class DuckSimulatorApp {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.setFlyBehaviour(new FlyWithNoWings());
        mallardDuck.performFly();
    }
}
