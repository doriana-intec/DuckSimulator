package jp.ekata.ducks;

import jp.ekata.interfaces.FlyBehaviour;
import jp.ekata.interfaces.QuackBehaviour;

public abstract class Duck {

    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    public Duck() {
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even the decoys!!!");
    }

    public abstract void display();







}
