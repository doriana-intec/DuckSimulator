package jp.ekata.ducks;

import jp.ekata.implementations.fly.FlyWithNoWings;
import jp.ekata.implementations.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehaviour(new FlyWithNoWings());
        setQuackBehaviour(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a yellow rubber duck");
    }
}
