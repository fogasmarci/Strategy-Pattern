package quack;

public class Mute implements QuackBehavior {

    @Override
    public void makeSound() {
        System.out.println("no sound is made");
    }
}
