import java.util.Arrays;

public class TaskTen {
    public static void main(String[] args) {
        TaskTen taskTen=new TaskTen();
        int[]array={1,2,3,4,5,6};
        taskTen.getLength(array);
    }
     private void getLength(int[] array){
        System.out.println(array.length);
    }
}
