package Patterns.StrategyPattern;

public class noFlyBehaviour implements FlyBehaviour {
    String fly="This duck does not fly";
    public String fly(){
        System.out.println("This duck does not fly");
        return fly;
    }
}
