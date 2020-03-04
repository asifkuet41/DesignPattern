package Client;

import ConcreteStrategies.FlyRocketPowered;
import Context.Duck;
import Context.MallardDuck;
import Context.ModelDuck;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class MiniDuckSimulator {
    public static void main(String []args){
        /*Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();*/

            double x ,y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();

        if(x/3 == y){
            System.out.println("yest");
        } else{
            System.out.println("no");
        }
        /*for(double x = 0.0 ; x<=2.0; x+=.2)
            System.out.println(x);*/
    }
}
