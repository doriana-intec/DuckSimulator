package jp.ekata.implementations.quack;

import jp.ekata.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
