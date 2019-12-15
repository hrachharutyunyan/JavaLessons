import java.util.Scanner;

public class NumberCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y;
        if (x > 0) {
            y = (3 * x) - 5;
            System.out.println(y);
        } else if (x == 0) {
            y = 0;
            System.out.println(y);
        } else {
            y = Math.abs(x) - 1;
            System.out.println(y);
        }
    }
}

