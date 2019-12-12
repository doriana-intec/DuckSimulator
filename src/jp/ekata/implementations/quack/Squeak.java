package jp.ekata.implementations.quack;

import jp.ekata.interfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeakkkkkk");
    }
}
