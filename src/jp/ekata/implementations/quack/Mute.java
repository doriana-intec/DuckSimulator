package jp.ekata.implementations.quack;

import jp.ekata.interfaces.QuackBehaviour;

public class Mute implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
