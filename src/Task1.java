import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        System.out.print("номер единицы массы (1-килограмм,2-миллиграмм,3-грамм,4-тонна,5-центнер):");
        int n = SCANNER.nextInt();
        System.out.print("масса:");
        double m = SCANNER.nextDouble();
        switch (n) {
            case 1:
                System.out.print(m);
                break;
            case 2:
                System.out.print(m / 1000000 + " кг");
                break;
            case 3:
                System.out.print(m / 1000 + " кг");
                break;
            case 4:
                System.out.print(m * 1000 + " кг");
                break;
            case 5:
                System.out.print(m * 100 + " кг");
                break;
        }
    }
}

