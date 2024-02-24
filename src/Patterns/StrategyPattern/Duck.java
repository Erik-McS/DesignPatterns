package Patterns.StrategyPattern;

public interface Duck {

    public String  performFly();
    public void performQuack();
    public void setFlyBehaviour(FlyBehaviour fly);
    public void setQuackBehaviour(QuackBehaviour quackBehaviour);
}
