package MidLevel;

public class Hokage {
    String name;
    int age;
    boolean isAlive;
    String village;
    double height;
    double weight;

    // ✔️ NoArgs constructor
    public Hokage(){};

    // ❌
    public Hokage(String name, int age){
        this.name = name;
        this.age = age;
    }

    // ❌
    public Hokage(int age){
        this.age = age;
    }

    // ✔️ All args constructor


    public Hokage(String name, int age, boolean isAlive, String village, double height, double weight) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
        this.village = village;
        this.height = height;
        this.weight = weight;
    }
}
