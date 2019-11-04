import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskTwo {

    public static void main(String[] args) {
        TaskOne taskOne = new TaskOne();
        List<Integer> list = new ArrayList<>(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Set<Integer> set = new HashSet<>(list);
        if(set.size()<list.size()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}