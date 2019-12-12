package jp.ekata.implementations.fly;

import jp.ekata.interfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
