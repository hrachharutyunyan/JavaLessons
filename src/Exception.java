public class Exception {
    public static void main(String[] args) {
        System.out.println("Test exception");
        try {
            System.out.println("test 1");
            System.out.println(5 / 0);
            System.out.println("test 2");
        } catch (java.lang.Exception e) {
            System.out.println("Number must not be zero");
        }
        System.out.println("Finish");
    }
}
