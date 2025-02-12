package MidLevel;

public class Main {
    public static void main(String[] args){
        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.age = 15;
        sasuke.village = "Konoha";
        System.out.println("sasuke.name = " + sasuke.name);
        sasuke.activatedSharigan();

        System.out.println(sasuke.welcomeMyNameIs());
        System.out.println(sasuke.missingYearsToBecomeHokage(23));

        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto Uzumaki";
        naruto.age = 17;
        naruto.village = "Konoha";

        System.out.println("naruto.name = " + naruto.name);
        naruto.activateWiseMode();
        System.out.println(naruto.welcomeMyNameIs());
        System.out.println(naruto.missingYearsToBecomeHokage(20));

        NarutoChild himawari = new NarutoChild();
        himawari.name = "Himawari Uzumaki";
        himawari.age = 8;
        himawari.village = "Konoha";

        System.out.println("himawari.name = " + himawari.name);
        himawari.activateWiseMode();
        System.out.println(himawari.welcomeMyNameIs());
        System.out.println(himawari.missingYearsToBecomeHokage(20));


    }
}
