import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите слово :");
        String str = scanner.nextLine();
        System.out.println(str.substring(2,3) + str.substring(str.length()-1));
    }
    }

