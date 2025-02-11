package MidLevel;

public class Ninja {
    String name;
    int age;
    String village;

    public void makeJutsu(){
        System.out.println("Jutsu was made");
    }

    public String welcomeMyNameIs(){
        return this.name;
    }

    public int missingYearsToBecomeHokage(int minimumAgeToBecomeHokage){
        return Math.abs(minimumAgeToBecomeHokage - this.age);
    }
}
