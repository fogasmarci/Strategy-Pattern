import ducks.Duck;
import ducks.RedheadDuck;
import ducks.RubberDuck;
import fly.FlyNoWay;


public class Main {
    public static void main(String[] args) {
        Duck duck1 = new RubberDuck();
        duck1.performFlyBehavior();
        duck1.perfromQuackBehavior();

        System.out.println("---------");

        Duck duck2 = new RedheadDuck();
        duck2.performFlyBehavior();
        duck2.perfromQuackBehavior();
        duck2.setFlyBehavior(new FlyNoWay());
        duck2.performFlyBehavior();
    }
}
