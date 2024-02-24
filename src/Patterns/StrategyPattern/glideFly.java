package Patterns.StrategyPattern;

public class glideFly implements flyBehaviour{
    @Override
    public void fly() {
        System.out.println("This duck now glides");
    }
}
