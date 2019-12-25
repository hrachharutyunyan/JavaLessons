package Strategy;

public class Stupid implements Strategy {

    @Override
    public void execute() {
        System.out.println("Ищет выход наугад, действует глупо");
    }
}
