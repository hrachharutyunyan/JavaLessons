package Factory;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TableStore tableStore = new TableStore();

        Table strangeTable = tableStore.orderTable("Mysterious table");

        Table officeTable = tableStore.orderTable("office");
        Table kitchenTable = tableStore.orderTable("kitchen");

    }
}