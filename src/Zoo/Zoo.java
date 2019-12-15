package Zoo;
//Зоопарк
class Zoo {
    public static void main(String[] args) {

    }

    private static String name;
    private int size;
    private int visitor;
    private int animal;
    private int staff;

    Zoo(String name, int size, int visitor, int animal, int staff) {
        Zoo.name = name;
        this.size = size;
        this.visitor = visitor;
        this.animal = animal;
        this.staff = staff;
    }

    String getZooinfo() {
        return "название:" + " " + name + ", " + "площадь:" + " " + size + "m2" + ", " + "посетителей:" + " " + visitor + ", " + "животных:" + " " + animal + ", " + "персонал:" + " " + staff + ".";
    }
}