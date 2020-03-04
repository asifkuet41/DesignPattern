package Context;

import ConcreteStrategies.FlyWithWings;
import ConcreteStrategies.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a real mallar duck");
    }
}
