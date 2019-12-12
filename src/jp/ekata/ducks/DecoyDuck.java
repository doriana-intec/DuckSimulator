package jp.ekata.ducks;

import jp.ekata.implementations.fly.FlyWithNoWings;
import jp.ekata.implementations.quack.Mute;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehaviour(new FlyWithNoWings());
        setQuackBehaviour(new Mute());
    }

    @Override
    public void display() {
        System.out.println("I'm just a dummy duck");
    }
}
