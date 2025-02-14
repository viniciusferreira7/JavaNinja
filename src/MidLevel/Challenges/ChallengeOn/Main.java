package MidLevel.Challenges.ChallengeOn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Uchiha> uchihaNinjasRecords = new ArrayList<Uchiha>();
        ArrayList<Ninja> withoutClanNinjasRecords = new ArrayList<Ninja>();

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

           boolean isValidIndex = false;

            optionSelected = input.nextInt();
            input.nextLine();


            switch (optionSelected){
                case 1:
                  Ninja createdNinja = Register.createNinja(input);

                   if(createdNinja.clan.equals("Uchiha")){
                       Uchiha registeredUchihaNinja = new Uchiha(
                               createdNinja.name,
                               createdNinja.age,
                               createdNinja.level,
                               createdNinja.specialSkill,
                               createdNinja.clan
                       );

                       uchihaNinjasRecords.add(registeredUchihaNinja);
                   }

                   if(createdNinja.clan.equals("wihout clan")){
                      Ninja registeredWithoutClanNinja = new Ninja(
                               createdNinja.name,
                               createdNinja.age,
                               createdNinja.level,
                               createdNinja.specialSkill,
                               createdNinja.clan
                      );

                       withoutClanNinjasRecords.add(registeredWithoutClanNinja);

                   } else {
                        System.out.println("\n ✔️ Ninja (" + createdNinja.clan  + ") has been successfully registered");
                    }

                    createdRecordsNumber++;

                    break;
                case 2:
                    clan = Register.getClan(input);

                    int optionIndex = Register.getIdxFromOption(input);

                    Ninja updatedNinja = Register.updatedNinja(input, clan);

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
                            Uchiha updatedUchihaNinja = new Uchiha(
                                    updatedNinja.name,
                                    updatedNinja.age,
                                    updatedNinja.level,
                                    updatedNinja.specialSkill,
                                    updatedNinja.clan
                            );

                            uchihaNinjasRecords.set(optionIndex, updatedUchihaNinja);

                            Uchiha uchihaNinja = uchihaNinjasRecords.get(optionIndex);
                            System.out.println(uchihaNinja.getName() + " is updated");

                            updatedRecordsNumber++;

                        }  else {
                            System.out.println("❌ Invalid index");
                        }

                    }

                    if(clan.equals("without clan")){
                        isValidIndex = optionIndex >= 0 && optionIndex < withoutClanNinjasRecords.size();

                        if (isValidIndex) {
                            Ninja updatedWithoutClanNinja = new Ninja(
                                    updatedNinja.name,
                                    updatedNinja.age,
                                    updatedNinja.level,
                                    updatedNinja.specialSkill,
                                    updatedNinja.clan
                            );

                            withoutClanNinjasRecords.set(optionIndex, updatedWithoutClanNinja);

                            Ninja withoutNinja = withoutClanNinjasRecords.get(optionIndex);
                            System.out.println(withoutNinja.getName() + " is updated");

                            updatedRecordsNumber++;

                        } else {
                            System.out.println("❌ Invalid index");
                        }

                    }

                    break;
                case 3:
                   clan = Register.getClan(input);

                    optionIndex = Register.getIdxFromOption(input);

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

                    if(clan.equals("without clan")){
                        isValidIndex = optionIndex >= 0 && optionIndex < withoutClanNinjasRecords.size();

                        if (isValidIndex) {
                            Ninja ninja = withoutClanNinjasRecords.get(optionIndex);
                            System.out.println(ninja.getInfoSquare());

                            withoutClanNinjasRecords.remove(optionIndex);
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
                    }

                    if(!withoutClanNinjasRecords.isEmpty()){
                        for (int i = 0; i < withoutClanNinjasRecords.size(); i++) {
                            int listItem = i + 1;
                            System.out.println("\n " + listItem + ". Ninja without:");
                            System.out.println(withoutClanNinjasRecords.get(i).getInfoSquare());
                        }
                    }

                    if(!uchihaNinjasRecords.isEmpty() && !withoutClanNinjasRecords.isEmpty()) {
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
