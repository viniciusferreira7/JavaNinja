package MidLevel;

public class Senju extends Hokage {

    public Senju(String name, int age, boolean isAlive) {
        super(name, age, isAlive);
    }

    @Override
    public void wisdomHokage() {
        System.out.println(this.age * 1.75);
    }
}
