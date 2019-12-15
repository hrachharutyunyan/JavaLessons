import java.util.Arrays;

public class RandomNumbersMaxMin {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = 3 + (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        int avg = 0;
        for (int value : array) {
            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
            avg += value;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg / array.length);
    }
}




