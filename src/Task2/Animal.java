package Task2;

class Animal {
    private String name;
    private String breed;
    private int age;
    private int weight;

    Animal(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    String getAnimalInfo() {
        return "имя: " + name + ", порода: " + breed + ", возраст: " + age + "лет" + ", вес: " + weight + "кг" + ".";
    }

   static String run(String direction) {
        return " бегает " + direction;
    }

    static String voice(String voice) {
        return " " + voice;
    }

    static String eat(String food) {
        return " ест " + food;
    }
}

