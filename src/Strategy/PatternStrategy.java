package Strategy;

public class PatternStrategy {

    public static void main(String[] args) {

        boolean genius = false;
        Mouse mouse = new Mouse();
        if (genius) {
            mouse.setStrategy(new Genius());
        } else {
            mouse.setStrategy(new Stupid());
        }
        mouse.execute();
    }
}
