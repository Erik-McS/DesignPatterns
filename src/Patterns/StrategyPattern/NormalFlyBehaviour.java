package Patterns.StrategyPattern;

public class NormalFlyBehaviour implements FlyBehaviour {
    String fly="Normal fly";
    @Override
    public String fly() {
        System.out.println("Normal fly");
        return fly;
    }
}
