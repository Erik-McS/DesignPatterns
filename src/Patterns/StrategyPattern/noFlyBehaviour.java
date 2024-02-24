package Patterns.StrategyPattern;

public class noFlyBehaviour implements flyBehaviour{

    public void fly(){
        System.out.println("This duck does not fly");
    }
}
