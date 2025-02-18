package MidLevel.Challenges.ChallengeTwo;

public class Main {
    public static void main(String[] args) {
        BasicNinja tenten = new BasicNinja("Tenten", 16, NinjaLevel.CHUNIN, JutsuType.TAIJUTSU);
        BasicNinja konohamaru = new BasicNinja("Konohamaru (Classic)", 12, NinjaLevel.GENIN, JutsuType.NINJUTSU);
        BasicNinja ino = new BasicNinja("Ino Yamanaka", 16, NinjaLevel.CHUNIN, JutsuType.GENJUTSU);
        BasicNinja kiba = new BasicNinja("Kiba Inuzuka", 16, NinjaLevel.CHUNIN, JutsuType.TAIJUTSU);
        BasicNinja ebisu = new BasicNinja("Ebisu", 28, NinjaLevel.JONIN, JutsuType.GENJUTSU);

        System.out.println(tenten.getInformation());
        System.out.println(tenten.executeSkill());
        System.out.println(konohamaru.getInformation());
        System.out.println(konohamaru.executeSkill());
        System.out.println(ino.getInformation());
        System.out.println(ino.executeSkill());
        System.out.println(kiba.getInformation());
        System.out.println(kiba.executeSkill());
        System.out.println(ebisu.getInformation());
        System.out.println(ebisu.executeSkill());

        AdvancedNinja naruto = new AdvancedNinja("Naruto Uzumaki", 20, NinjaLevel.GENIN, JutsuType.SENJUTSU, "Modo Rikudou Sennin");
        AdvancedNinja sasuke = new AdvancedNinja("Sasuke Uchiha", 20, NinjaLevel.JONIN, JutsuType.DOJUTSU, "Rinnegan e Sharingan Eterno");
        AdvancedNinja kakashi = new AdvancedNinja("Kakashi Hatake", 35, NinjaLevel.JONIN, JutsuType.RAITON, "Raikiri e Sharingan");
        AdvancedNinja itachi = new AdvancedNinja("Itachi Uchiha", 21, NinjaLevel.JONIN, JutsuType.GENJUTSU, "Tsukuyomi e Susanoo");
        AdvancedNinja minato = new AdvancedNinja("Minato Namikaze", 24, NinjaLevel.JONIN, JutsuType.NINJUTSU, "Hiraishin no Jutsu");

        System.out.println(naruto.getInformation());
        System.out.println(naruto.executeSkill());
        System.out.println(sasuke.getInformation());
        System.out.println(sasuke.executeSkill());
        System.out.println(kakashi.getInformation());
        System.out.println(kakashi.executeSkill());
        System.out.println(itachi.getInformation());
        System.out.println(itachi.executeSkill());
        System.out.println(minato.getInformation());
        System.out.println(minato.executeSkill());
    }
}
