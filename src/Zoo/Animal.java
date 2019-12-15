package Zoo;

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

    String run(String direction) {
        return " бегает " + direction;
    }

     String voice(String voice) {
        return " " + voice;
    }

     String eat(String food) {
        return " ест " + food;
    }
}

