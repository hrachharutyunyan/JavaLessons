public class TaskTwo {
    public static void main(String[] args) {
        int num = -2;
        System.out.println("Number is negative=" + plusMinus(num));
    }

    static boolean plusMinus(int num) {
        boolean result = false;
        if (num < 0) {
            result = true;
        }
        return result;
    }
}
