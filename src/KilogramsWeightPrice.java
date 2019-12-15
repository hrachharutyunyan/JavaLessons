import java.util.Scanner;

public class KilogramsWeightPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int kg = 1;
        while (kg <= 10) {
            kg +=2;
            System.out.println(kg + " kg = " + price * kg + " Dram");
        }
    }
}