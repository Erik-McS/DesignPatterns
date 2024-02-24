package Patterns.StrategyPattern;

public class noQuackBehaviour implements quackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack (1)");
    }
}
