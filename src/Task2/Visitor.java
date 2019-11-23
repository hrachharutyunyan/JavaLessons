package Task2;

class Visitor {
    private String name;
    private String surname;
    private String nation;
    private int children;

    Visitor(String name, String surname, String nation, int children) {
        this.name = name;
        this.surname = surname;
        this.nation = nation;
        this.children = children;
    }

    String getVisitorInfo() {
        return "имя: " + name + ", фамилия: " + surname + ", национальность: " + nation + ", дети: " + children + ".";
    }

    static String voice(String speech) {
        return " говорит " + speech;
    }

    static String pay(int money) {
        return " платит " + money + " драм ";
    }

    static String walk(String place) {
        return " идет в " + place;
    }

}