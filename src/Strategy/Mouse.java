package Strategy;

public class Mouse {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy=strategy;
    }

    public void execute(){
        strategy.execute();
    }
}
