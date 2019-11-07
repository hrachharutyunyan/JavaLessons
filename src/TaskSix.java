import java.util.ArrayList;

public class TaskSix {
    public static void main(String[] args) {
        TaskSix taskSix = new TaskSix();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//5
        list.add(2);//10
        list.add(3);//15
        int num = 5;
        System.out.println(taskSix.multlist(list, num));
    }

    private ArrayList<Integer> multlist(ArrayList<Integer> list, int num) {

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * num);
        }
        return list;
    }
}
