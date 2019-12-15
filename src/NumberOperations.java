import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            number += 2;
        } else {
            number *= 2;
        }
        System.out.println(number);
    }
}
