package MidLevel.Challenges.ChallengeOn;

import java.util.Scanner;

public class RegisterNinja {
    public static String getClan(Scanner input){
        System.out.println("Which clan is the ninja? ");
        System.out.println("1. Uzumaki");
        System.out.println("2. Uchiha");
        System.out.println("3. Hyuga");

        int clanOption = input.nextInt();
        input.nextLine();

       String clan = Ninja.getClanByOption(clanOption);

        return clan;
    }

    public static String getName(Scanner input){
        System.out.println("Enter with name: ");

        return input.nextLine();
    }

    public static int getAge(Scanner input){
        System.out.println("Enter with age: ");
        int age = input.nextInt();
        input.nextLine();

        return age;
    }

    public static Level getLevel(Scanner input){
        System.out.println("Enter with a ninja level: ");
        System.out.println("1. Genin");
        System.out.println("2. Chūnin");
        System.out.println("3. Jōnin");
        int levelOption = input.nextInt();
        input.nextLine();

        Level level;

        if(levelOption <= 0 || levelOption > 3){
            System.out.println("❌ Invalid option, you'll start out as a genin");
            level = Level.GENIN;
        } else {
            level = Ninja.getLevelByOption(levelOption);
        }

        return level;
    }

    public static String getSpecialSkill(Scanner input){
        System.out.println("Which one uses a special skill? ");
        return input.nextLine();
    }

    public static Ninja createNinja(Scanner input){
       String clan = RegisterNinja.getClan(input);
       String name = RegisterNinja.getName(input);
       int age = RegisterNinja.getAge(input);
       Level level = RegisterNinja.getLevel(input);
       String specialSkill = RegisterNinja.getSpecialSkill(input);

        return new Ninja(name, age, level, specialSkill, clan, null);
    }

    public static int getIdxFromOption(Scanner input){
        System.out.println("Enter with number of ninja in list");
        int option = input.nextInt();
        input.nextLine();

        return option - 1;
    }

    public static Ninja updatedNinja(Scanner input, String clan){
       String name = RegisterNinja.getName(input);
       int age = RegisterNinja.getAge(input);
       Level level = RegisterNinja.getLevel(input);
       String specialSkill = RegisterNinja.getSpecialSkill(input);

        return new Ninja(name, age, level, specialSkill, clan, null);
    }

}
