import java.util.ArrayList;

public class TaskOne {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);
        int sum = 0;
        for (int i : list) {
            sum += Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
