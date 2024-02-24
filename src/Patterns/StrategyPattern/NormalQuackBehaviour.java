package Patterns.StrategyPattern;

public class NormalQuackBehaviour implements QuackBehaviour {
    String quack="Normal quack";
    @Override
    public String quack() {
        System.out.println("Normal quack");
        return "Normal quack";
    }
}
