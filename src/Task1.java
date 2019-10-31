import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float price = scanner.nextFloat();
        float kg = 1.0f;
        while (kg <= 2) {
            kg += 0.2f;
            System.out.println(kg + " kg = " + price * kg + " Dram");
        }
    }
}