import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskTwoFour {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(4);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(1);
        int dif = 0;
        Set<Integer> set = new HashSet<>(list);
        if (set.size() < list.size()) {
            dif = list.size() - set.size();
        }
        if (dif == 1) {
            System.out.println("в коллекции только два одинаковых элемента");
        } else if (dif > 1) {
            System.out.println("в коллекции больше двух одинаковых элемента");
        } else {
            System.out.println("в коллекции нет одинаковых элемента");
        }
    }
}