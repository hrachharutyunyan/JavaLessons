import java.util.ArrayList;
import java.util.List;

public class CollectionAddSymbolToElement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.stream().map((i) -> i + "1").forEach(System.out::println);
    }
}
