package Patterns.StrategyPattern;

public class glideFly implements FlyBehaviour {
    String fly="This duck now glides";
    @Override
    public String fly() {
        System.out.println("This duck now glides");
        return fly;
    }
}
