import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int a = 3; // от
        int b = 15; // до
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = a + (int) (Math.random() * b);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            avg += array[i];
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg / array.length);
    }
}




