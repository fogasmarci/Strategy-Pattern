package ducks;

import fly.FlyWithWings;
import quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Looks like a RedheadDuck");
    }
}
