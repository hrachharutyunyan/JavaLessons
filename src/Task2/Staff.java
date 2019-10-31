package Task2;

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

    static String hello3() {
        return "Բարև, Привет, Hello!";
    }

   static String care() {
        return " ухаживает за";
    }
}

