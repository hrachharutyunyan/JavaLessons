package Zoo;

class Staff {
    private String name;
    private String surname;
    private String position;
    private int experience;

    Staff(String name, String surname, String position, int experience) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.experience = experience;
    }

    String getStaffInfo() {
        return "имя: " + name + ", фамилия: " + surname + ", должность: " + position + ", стаж: " + experience + " лет.";
    }

    void helloEnglish() {
        System.out.println("Hello");
    }
    void helloRussian() {
        System.out.println("Привет");
    }
    void helloArmenian() {
        System.out.println("Բարև");
    }

    String care(Animal animal) {
        return " ухаживает за" + animal;
    }
}

