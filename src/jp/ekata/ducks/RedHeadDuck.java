package jp.ekata.ducks;

import jp.ekata.implementations.fly.FlyWithWings;
import jp.ekata.implementations.quack.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real bossy redhead duck");
    }
}
