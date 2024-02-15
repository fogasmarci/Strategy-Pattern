package quack;

public class Quack implements QuackBehavior {
    @Override
    public void makeSound() {
        System.out.println("Quack");
    }
}