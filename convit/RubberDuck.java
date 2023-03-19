package convit;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new DuckCall();
    }

    public void display() {

        System.out.println("I'm a Rubber Duck");
    }
}
