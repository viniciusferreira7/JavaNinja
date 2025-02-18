package MidLevel;

public abstract class Hokage {
   protected final String name;
   protected final int age;
   protected final boolean isAlive;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    // ✔️ All args constructor
    public Hokage(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public abstract void wisdomHokage();
}
