package Patterns.StrategyPattern;

public class noQuackBehaviour implements QuackBehaviour {
    String quack="No quack";
    @Override
    public String quack() {
        System.out.println("No quack");
        return quack;
    }
}