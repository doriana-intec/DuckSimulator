package jp.ekata.implementations.fly;

import jp.ekata.interfaces.FlyBehaviour;

public class FlyWithNoWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
