package MidLevel;

public class Uzumaki extends Ninja{
    public void activateWiseMode() {
        System.out.println(name + "activate wise mode");
    }

    @Override
    public void makeJutsu() {
        System.out.println("Kage bunshin created");
    }
}
