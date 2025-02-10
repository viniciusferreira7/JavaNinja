package BasicLevel.Challenges.ChallengeTwo;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

enum Level {
    GENIN, CHUNIN, JONIN
};

class Ninja {
    private final String name;
    private final int age;
    private final Level level;
    private final String createdAt;

    Ninja(String name, int age, Level level) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.createdAt = this.getDate();
    }

    private String getDate(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");

        return now.format(formatter);
    }

    public String showDetails() {
        String border = "+--------------------+";

        return String.format(
                "%s\n| Name: %-12s |\n| Age: %-13d |\n| Level: %-11s |\n| Created at: %-12s |\n%s",
                border, this.name, this.age, this.level.toString().toLowerCase(), this.createdAt, border
        );
    }


    public static Level getLevelByOption(int optionForLevel) {
        if(optionForLevel == 1){
            return Level.GENIN;
        }

        if(optionForLevel == 2){
            return Level.CHUNIN;
        }

        return Level.JONIN;
    }
}

public class ChallengeTwo {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        int maximumNumberOfRecords = 5;
        Ninja[] ninjaRecords = new Ninja[maximumNumberOfRecords];

        int optionSelected = 0;
        int loops = 0;
        int recordsNumber = 0;

        while(optionSelected != 3){
            if(loops == 0) {
                System.out.println("\n Welcome to the ninja record books");
            }
            System.out.println("\n===== Ninja Menu =====");
            System.out.println("1. Register Ninja"); // ✔️
            System.out.println("2. List Ninjas"); // ✔️
            System.out.println("3. Exit"); // ✔️
            System.out.print("Choose an option: ");

            optionSelected = input.nextInt();
            input.nextLine();


            switch (optionSelected){
                case 1:
                    if(recordsNumber < maximumNumberOfRecords){
                        System.out.println("Enter with name: ");
                        String name = input.nextLine();

                        System.out.println("Enter with age: ");
                        int age = input.nextInt();

                        System.out.println("Enter with a ninja level: ");
                        System.out.println("1. Genin");
                        System.out.println("2. Chūnin");
                        System.out.println("3. Jōnin");

                        int levelOption = input.nextInt();
                        input.nextLine();

                        if(levelOption <= 3 && levelOption >= 0){
                            Level level = Ninja.getLevelByOption(levelOption);

                            Ninja registedNinja = new Ninja(name, age, level);
                            ninjaRecords[recordsNumber] = registedNinja;
                            System.out.println("\n ✔️ Ninja has been successfully registered");

                            recordsNumber++;
                        } else {
                            System.out.println("❌ Invalid option");
                        }

                    } else {
                        System.out.println("\nYou've reached the record limit for today, try again tomorrow");
                    }

                    break;
                case 2:
                    if(recordsNumber > 0){
                        for (int i = 0; i < recordsNumber; i++) {
                            System.out.println("\n Ninja:");
                            System.out.println(ninjaRecords[i].showDetails());
                        }
                    } else {
                        System.out.println("You don't register anyone");
                    }
                    break;
                case 3:
                    System.out.println("\n 😁 Thanks for your participation");
                    if(recordsNumber >0){
                        System.out.println("\n 🚀 You created " + recordsNumber + " records");
                    }
                    break;
                default:
                    System.out.println("❌ Invalid option");
            }

            loops++;
        }
    input.close();
    }
}
