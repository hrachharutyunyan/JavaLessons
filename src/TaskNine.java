public class TaskNine {
    public static void main(String[] args) {
        TaskNine taskNine=new TaskNine();
        int x = 8;
        int y = 6;
        int x1;
        int y1;
        int[] array = taskNine.multDivNums(x, y);
        x1 = array[0];
        y1 = array[1];

        taskNine.getNums(x1,y1);
    }

      private void getNums(int x1, int y1) {

        System.out.println(x1 + "" + y1);
    }

     private int[] multDivNums(int x, int y) {
        int[] array = {x, y};
        array[0] = (x * y) / y;
        array[1] = (y * x) / x;
        return array;
    }
}
