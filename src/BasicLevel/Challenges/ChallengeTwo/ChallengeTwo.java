package BasicLevel.Challenges.ChallengeTwo;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

enum Level {
    GENIN, CHUNIN, JONIN
};

class Ninja {
    private String name;
    private int age;
    private Level level;
    private final String createdAt;

    Ninja(String name, int age, Level level) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.createdAt = this.getDate();
    }

    public String getName(){
        return this.name;
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

        ArrayList<Ninja> ninjaRecords = new ArrayList<Ninja>();

        int optionSelected = 0;
        int loops = 0;
        int createdRecordsNumber = 0;
        int updatedRecordsNumber = 0;
        int deletedRecordsNumber = 0;

        while(optionSelected != 5){
            if(loops == 0) {
                System.out.println("\n Welcome to the ninja record books");
            }
            System.out.println("\n===== Ninja Menu =====");
            System.out.println("1. Register Ninja"); // ✔️
            System.out.println("2. Update Ninja"); // ✔️
            System.out.println("3. Delete Ninja"); // ✔️
            System.out.println("4. List Ninjas"); // ✔️
            System.out.println("5. Exit"); // ✔️
            System.out.print("Choose an option: ");

            optionSelected = input.nextInt();
            input.nextLine();


            switch (optionSelected){
                case 1:
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
                        ninjaRecords.add(registedNinja);
                        System.out.println("\n ✔️ Ninja has been successfully registered");

                        createdRecordsNumber++;
                    } else {
                        System.out.println("❌ Invalid option");
                    }

                    break;
                case 2:
                    System.out.println("Enter with number of item in list");
                    int newOption = input.nextInt();
                    input.nextLine();

                    int newOptionIndex = newOption - 1;
                    boolean isNewValidIndex = newOptionIndex >= 0 && newOptionIndex < ninjaRecords.size();

                    if (isNewValidIndex) {
                        Ninja oldNinja = ninjaRecords.get(newOptionIndex);

                        System.out.println(oldNinja.showDetails());

                        System.out.println("Enter with new name: ");
                        String newName = input.nextLine();

                        System.out.println("Enter with new age: ");
                        int newAge = input.nextInt();

                        System.out.println("Enter with a new ninja level: ");
                        System.out.println("1. Genin");
                        System.out.println("2. Chūnin");
                        System.out.println("3. Jōnin");

                        int newLevelOption = input.nextInt();
                        input.nextLine();

                        if(newLevelOption <= 3 && newLevelOption >= 0){
                            Level level = Ninja.getLevelByOption(newLevelOption);

                            Ninja updatedNinja = new Ninja(newName, newAge, level);
                            ninjaRecords.set(newOptionIndex, updatedNinja);

                            Ninja ninja = ninjaRecords.get(newOptionIndex);
                            System.out.println(ninja.getName() + " is updated");

                            updatedRecordsNumber++;

                        } else {
                            System.out.println("❌ Invalid option");
                        }

                    } else {
                        System.out.println("❌ Invalid index");
                    }
                    break;
                case 3:
                    System.out.println("Enter with number of item in list");
                    int option = input.nextInt();

                    int optionIndex = option - 1;
                    boolean isValidIndex = optionIndex >= 0 && optionIndex < ninjaRecords.size();

                    if (isValidIndex) {
                        Ninja ninja = ninjaRecords.get(optionIndex);
                        System.out.println(ninja.showDetails());

                        ninjaRecords.remove(optionIndex);
                        System.out.println(ninja.getName() + " is removed");

                        deletedRecordsNumber++;
                    } else {
                        System.out.println("❌ Invalid index");
                    }


                    break;
                case 4:
                    if(!ninjaRecords.isEmpty()){
                        for (int i = 0; i < ninjaRecords.size(); i++) {
                            int listItem = i + 1;
                            System.out.println("\n " + listItem + ". Ninja:");
                            System.out.println(ninjaRecords.get(i).showDetails());
                        }
                    } else {
                        System.out.println("You don't register anyone in list");
                    }
                    break;
                case 5:
                    System.out.println("\n😁 Thanks for your participation");
                    if (createdRecordsNumber > 0) {
                        System.out.println("🎉 You successfully created " + createdRecordsNumber + " record(s)!");
                    }
                    if (updatedRecordsNumber > 0) {
                        System.out.println("✏️ You successfully updated " + updatedRecordsNumber + " record(s)!");
                    }
                    if (deletedRecordsNumber > 0) {
                        System.out.println("🗑️ You successfully deleted " + deletedRecordsNumber + " record(s)!");
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
