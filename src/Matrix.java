import java.util.*;

public class Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[4];
        int[] y = new int[4];

        for (int i = 0; i < 4; ++i) {
            System.out.print("Введите (x" + i + ",y" + i + "): ");
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
            new Scanner(System.in).nextLine();
        }
        int a = (x[1] - x[0]) * (y[2] - y[1]) - (x[2] - x[1]) * (y[1] - y[0]);
        int b = (x[2] - x[0]) * (y[3] - y[2]) - (x[3] - x[2]) * (y[2] - y[0]);
        int c = (x[3] - x[0]) * (y[1] - y[3]) - (x[1] - x[3]) * (y[3] - y[0]);

        if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0)) {
            System.out.println("Принадлежит треугольнику");
        } else {
            System.out.println("Не принадлежит треугольнику");
        }
    }
}
