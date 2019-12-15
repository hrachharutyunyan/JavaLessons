import java.util.ArrayList;
import java.util.List;

public class SquaresSum {
    public static void main(String[] args) {
        SquaresSum squaresSum = new SquaresSum();
        List<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(squaresSum.getSum(list));
    }

    private int getSum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

}
