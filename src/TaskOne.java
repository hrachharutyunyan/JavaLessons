import java.util.ArrayList;
import java.util.List;

public class TaskOne {
    public static void main(String[] args) {
        TaskOne taskOne = new TaskOne();
        List<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(taskOne.getSum(list));
    }

    /**
     * Calculates the sum of the squares of all elements in the collection.
     *
     * @param list
     * @return
     */
    int getSum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

}
