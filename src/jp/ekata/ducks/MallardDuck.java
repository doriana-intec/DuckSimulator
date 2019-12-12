package jp.ekata.ducks;

import jp.ekata.implementations.fly.FlyWithWings;
import jp.ekata.implementations.quack.Quack;
import jp.ekata.interfaces.FlyBehaviour;
import jp.ekata.interfaces.QuackBehaviour;

public class MallardDuck extends Duck {

    public MallardDuck() {
         quackBehaviour = new Quack();
         flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
