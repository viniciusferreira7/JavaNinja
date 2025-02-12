package MidLevel;

interface UzumakiCla {
    public void activateWiseMode();
}

interface HyuugaCla {
    public void activatedByakugan();
}

public class NarutoChild extends Ninja implements UzumakiCla, HyuugaCla {
    public void activatedByakugan() {
        System.out.println(name + " activated Byakugan");
    }

    public void activateWiseMode() {
        System.out.println(name + "activate wise mode");
    }
}
