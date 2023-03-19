package convit;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new CannotQuack();
    }

    public void display() {

        System.out.println("I'm a Redhead Duck");
    }
}
