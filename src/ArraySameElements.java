import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraySameElements {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(4);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        Set<Integer> set = new HashSet<>(list);
        if (set.size() < list.size()) {
            System.out.println("в коллекции есть одинаковые элементы");
        } else {
            System.out.println("в коллекции нет одинаковых элементов");
        }
    }
}