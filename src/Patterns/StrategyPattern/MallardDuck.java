package Patterns.StrategyPattern;

public class MallardDuck implements Duck{
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public MallardDuck(FlyBehaviour flyBehaviour,QuackBehaviour quackBehaviour){
        setFlyBehaviour(flyBehaviour);
        setQuackBehaviour(quackBehaviour);
    }
    public MallardDuck(){
        setFlyBehaviour(new NormalFlyBehaviour());
        setQuackBehaviour(new NormalQuackBehaviour());
    }

    @Override
    public String performFly() {
        return flyBehaviour.fly();
    }

    @Override
    public void performQuack() {
        quackBehaviour.quack();
    }

    @Override
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    @Override
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
