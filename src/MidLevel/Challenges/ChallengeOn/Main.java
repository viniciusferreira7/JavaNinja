package MidLevel.Challenges.ChallengeOn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Uchiha> uchihaNinjasRecords = new ArrayList<Uchiha>();

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

           int clanOption;
           String clan;

            String name;
            int age;
            int levelOption;
            String specialSkill;

           boolean isValidIndex = false;

            optionSelected = input.nextInt();
            input.nextLine();


            switch (optionSelected){
                case 1:
                    System.out.println("Choose a clan: ");
                    System.out.println("1. Uzumaki");
                    System.out.println("2. Uchiha");
                    System.out.println("3. Hyuga");
                    clanOption = input.nextInt();
                    input.nextLine();

                    clan = Ninja.getClanByOption(clanOption);

                    if (clan.isEmpty()) {
                        return;
                    }

                    System.out.println("Enter with name: ");
                    name = input.nextLine();

                    System.out.println("Enter with age: ");
                    age = input.nextInt();

                    System.out.println("Enter with a ninja level: ");
                    System.out.println("1. Genin");
                    System.out.println("2. Chūnin");
                    System.out.println("3. Jōnin");

                    System.out.println("Last but not least, which one uses a special skill? ");
                    specialSkill = input.nextLine();

                    levelOption = input.nextInt();
                    input.nextLine();

                    if(levelOption <= 3 && levelOption >= 0){
                       Level level =Ninja.getLevelByOption(levelOption);

                      /* if(clan.equals("Uzumaki")){
                            Ninja registedUchihaNinja = newNinja(name, age, level);
                           uchihaNinjasRecords.add(registedNinja);
                       }*/

                       if(clan.equals("Uchiha")){
                           Uchiha registedUchihaNinja = new Uchiha(name, age, level, specialSkill, clan );
                           uchihaNinjasRecords.add(registedUchihaNinja);
                       }

                        System.out.println("\n ✔️ Ninja (" + clan  + ") has been successfully registered");


                        createdRecordsNumber++;
                    } else {
                        System.out.println("❌ Invalid option");
                    }

                    break;
                case 2:
                    System.out.println("Which clan is the ninja? ");
                    System.out.println("1. Uzumaki");
                    System.out.println("2. Uchiha");
                    System.out.println("3. Hyuga");
                    clanOption = input.nextInt();
                    input.nextLine();

                    clan = Ninja.getClanByOption(clanOption);

                    if (clan.isEmpty()) {
                        System.out.println("❌ Clan not found!");
                        return;
                    }

                    System.out.println("Enter with number of item in list");
                    int option = input.nextInt();
                    input.nextLine();

                    int optionIndex = option - 1;

                    /*if(clan.equals("Uzumaki")){
                        boolean isNewValidIndex = optionIndex >= 0 && optionIndex < ninjaRecords.size();

                        if (isNewValidIndex) {
                            Ninja oldNinja = ninjaRecords.get(optionIndex);

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
                                Level level =Ninja.getLevelByOption(newLevelOption);

                                Ninja updatedNinja = newNinja(newName, newAge, level);
                                ninjaRecords.set(optionIndex, updatedNinja);

                                Ninja ninja = ninjaRecords.get(optionIndex);
                                System.out.println(ninja.getName() + " is updated");

                                updatedRecordsNumber++;

                            } else {
                                System.out.println("❌ Invalid option");
                            }

                        } else {
                            System.out.println("❌ Invalid index");
                        }
                    }
*/
                    if(clan.equals("Uchiha")){
                         isValidIndex = optionIndex >= 0 && optionIndex < uchihaNinjasRecords.size();

                        if (isValidIndex) {
                            Uchiha previousNinja = uchihaNinjasRecords.get(optionIndex);

                            System.out.println(previousNinja.getInfoSquare());

                            System.out.println("Enter with new name: ");
                            name = input.nextLine();

                            System.out.println("Enter with new age: ");
                            age = input.nextInt();

                            System.out.println("Enter with a new ninja level: ");
                            System.out.println("1. Genin");
                            System.out.println("2. Chūnin");
                            System.out.println("3. Jōnin");

                            levelOption = input.nextInt();
                            input.nextLine();

                            System.out.println("Update your special skill? ");
                            specialSkill = input.nextLine();

                            if(levelOption <= 3 && levelOption >= 0){
                                Level level = Ninja.getLevelByOption(levelOption);

                                Uchiha updatedUchihaNinja = new Uchiha(name, age, level, specialSkill, clan);
                                uchihaNinjasRecords.set(optionIndex, updatedUchihaNinja);

                                Ninja ninja = uchihaNinjasRecords.get(optionIndex);
                                System.out.println(ninja.getName() + " is updated");

                                updatedRecordsNumber++;

                            } else {
                                System.out.println("❌ Invalid option");
                            }

                        } else {
                            System.out.println("❌ Invalid index");
                        }
                    }


                    break;
                case 3:
                    System.out.println("Which clan is the ninja? ");
                    System.out.println("1. Uzumaki");
                    System.out.println("2. Uchiha");
                    System.out.println("3. Hyuga");
                    clanOption = input.nextInt();
                    input.nextLine();

                    clan = Ninja.getClanByOption(clanOption);

                    if (clan.isEmpty()) {
                        System.out.println("❌ Clan not found!");
                        return;
                    }

                    System.out.println("Enter with number of item in list");
                    option = input.nextInt();

                    optionIndex = option - 1;

                    if(clan.equals("Uchiha")){
                        isValidIndex = optionIndex >= 0 && optionIndex < uchihaNinjasRecords.size();

                        if (isValidIndex) {
                            Ninja ninja = uchihaNinjasRecords.get(optionIndex);
                            System.out.println(ninja.getInfoSquare());

                            uchihaNinjasRecords.remove(optionIndex);
                            System.out.println(ninja.getName() + " is removed");

                            deletedRecordsNumber++;

                        } else {
                            System.out.println("❌ Invalid index");
                        }
                    }


                    break;
                case 4:
                    if(!uchihaNinjasRecords.isEmpty()){
                        for (int i = 0; i < uchihaNinjasRecords.size(); i++) {
                            int listItem = i + 1;
                            System.out.println("\n " + listItem + ". Ninja clãn Uchiha:");
                            System.out.println(uchihaNinjasRecords.get(i).getInfoSquare());
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
