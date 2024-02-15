package quack;

public class Squeak implements QuackBehavior {
    @Override
    public void makeSound() {
        System.out.println("Squeak");
    }
}
