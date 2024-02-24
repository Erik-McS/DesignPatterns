package Patterns.StrategyPattern;

public class StrategyPatternMain {

    public static void main(String[] args) {

        Duck duck1=new MallardDuck(new glideFly(),new NormalQuackBehaviour());

        duck1.performFly();
        duck1.performQuack();
        duck1.setFlyBehaviour(new noFlyBehaviour());
        duck1.performFly();
    }
}
