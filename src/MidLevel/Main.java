package MidLevel;

public class Main {
    public static void main(String[] args){
        Ninja naruto = new Ninja();
        naruto.name = "Naruto Uzumaki";
        naruto.age = 15;
        naruto.village = "Konoha";
        System.out.println("naruto.name = " + naruto.name);
        naruto.makeJutsu();
        System.out.println(naruto.welcomeMyNameIs());
        System.out.println(naruto.missingYearsToBecomeHokage(23));
    }
}
