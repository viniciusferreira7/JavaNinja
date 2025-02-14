package MidLevel.Challenges.ChallengeOn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Uzumaki> uzumakiClanNinjasRecords = new ArrayList<Uzumaki>();
        ArrayList<Uchiha> uchihaClanNinjasRecords = new ArrayList<Uchiha>();
        ArrayList<Hyuga> hyugaClanNinjasRecords = new ArrayList<Hyuga>();
        ArrayList<Ninja> withoutClanNinjasRecords = new ArrayList<Ninja>();

        int optionSelected = 0;
        int loops = 0;
        int createdRecordsNumber = 0;
        int updatedRecordsNumber = 0;
        int deletedRecordsNumber = 0;

        while(optionSelected != 7){
            if(loops == 0) {
                System.out.println("\n Welcome to the ninja record books");
            }
            System.out.println("\n===== Ninja Menu =====");
            System.out.println("1. Register Ninja"); // ✔️
            System.out.println("2. Update Ninja"); // ✔️
            System.out.println("3. Delete Ninja"); // ✔️
            System.out.println("4. List Ninjas"); // ✔️
            System.out.println("5. Register mission to ninja"); // ✔️
            System.out.println("6. Update status mission to ninja"); // ✔️
            System.out.println("7. Exit"); // ✔️
            System.out.print("Choose an option: ");

           int clanOption;
           String clan;
           int optionIndex;

           boolean isValidIndex = false;

            optionSelected = input.nextInt();
            input.nextLine();


            switch (optionSelected){
                case 1:
                  Ninja createdNinja = RegisterNinja.createNinja(input);

                   if(createdNinja.clan.equals("Uzumaki")){
                       Uzumaki registeredUzumakiNinja = new Uzumaki(
                               createdNinja.name,
                               createdNinja.age,
                               createdNinja.level,
                               createdNinja.specialSkill,
                               createdNinja.clan,
                               null
                       );

                       uzumakiClanNinjasRecords.add(registeredUzumakiNinja);
                   }

                   if(createdNinja.clan.equals("Uchiha")){
                       Uchiha registeredUchihaNinja = new Uchiha(
                               createdNinja.name,
                               createdNinja.age,
                               createdNinja.level,
                               createdNinja.specialSkill,
                               createdNinja.clan,
                               null
                       );

                       uchihaClanNinjasRecords.add(registeredUchihaNinja);
                   }

                   if(createdNinja.clan.equals("Hyuga")){
                       Hyuga registeredHyugaNinja = new Hyuga(
                               createdNinja.name,
                               createdNinja.age,
                               createdNinja.level,
                               createdNinja.specialSkill,
                               createdNinja.clan,
                               null
                       );

                       hyugaClanNinjasRecords.add(registeredHyugaNinja);
                   }

                   if(createdNinja.clan.equals("without clan")){
                      Ninja registeredWithoutClanNinja = new Ninja(
                               createdNinja.name,
                               createdNinja.age,
                               createdNinja.level,
                               createdNinja.specialSkill,
                               createdNinja.clan,
                              null
                      );

                       withoutClanNinjasRecords.add(registeredWithoutClanNinja);

                   }

                   System.out.println("\n ✔️ Ninja (" + createdNinja.clan  + ") has been successfully registered");

                    createdRecordsNumber++;

                    break;
                case 2:
                    clan = RegisterNinja.getClan(input);

                    optionIndex = RegisterNinja.getIdxFromOption(input);

                    Ninja updatedNinja = RegisterNinja.updatedNinja(input, clan);

                    if(clan.equals("Uzumaki")){
                         isValidIndex = optionIndex >= 0 && optionIndex < uzumakiClanNinjasRecords.size();

                        if (isValidIndex) {
                            Uzumaki updatedUzumakiNinja = new Uzumaki(
                                    updatedNinja.name,
                                    updatedNinja.age,
                                    updatedNinja.level,
                                    updatedNinja.specialSkill,
                                    updatedNinja.clan,
                                    updatedNinja.currentMission != null  ? updatedNinja.currentMission : null
                            );

                            uzumakiClanNinjasRecords.set(optionIndex, updatedUzumakiNinja);

                            System.out.println(updatedUzumakiNinja.getInfoSquare());
                            System.out.println(updatedUzumakiNinja.getName() + " is updated");

                            updatedRecordsNumber++;

                        }  else {
                            System.out.println("❌ Invalid index");
                        }

                    }

                    if(clan.equals("Uchiha")){
                         isValidIndex = optionIndex >= 0 && optionIndex < uchihaClanNinjasRecords.size();

                        if (isValidIndex) {
                            Uchiha updatedUchihaNinja = new Uchiha(
                                    updatedNinja.name,
                                    updatedNinja.age,
                                    updatedNinja.level,
                                    updatedNinja.specialSkill,
                                    updatedNinja.clan,
                                    updatedNinja.currentMission != null  ? updatedNinja.currentMission : null
                            );

                            uchihaClanNinjasRecords.set(optionIndex, updatedUchihaNinja);

                            System.out.println(updatedUchihaNinja.getInfoSquare());
                            System.out.println(updatedUchihaNinja.getName() + " is updated");

                            updatedRecordsNumber++;

                        }  else {
                            System.out.println("❌ Invalid index");
                        }

                    }

                    if(clan.equals("Hyuga")){
                         isValidIndex = optionIndex >= 0 && optionIndex < hyugaClanNinjasRecords.size();

                        if (isValidIndex) {
                            Hyuga updatedHyugaNinja = new Hyuga(
                                    updatedNinja.name,
                                    updatedNinja.age,
                                    updatedNinja.level,
                                    updatedNinja.specialSkill,
                                    updatedNinja.clan,
                                    updatedNinja.currentMission != null  ? updatedNinja.currentMission : null
                            );

                            hyugaClanNinjasRecords.set(optionIndex, updatedHyugaNinja);

                            Hyuga hyugaNinja = hyugaClanNinjasRecords.get(optionIndex);
                            System.out.println(updatedHyugaNinja.getInfoSquare());
                            System.out.println(updatedHyugaNinja.getName() + " is updated");

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
                                    updatedNinja.clan,
                                    null
                            );

                            withoutClanNinjasRecords.set(optionIndex, updatedWithoutClanNinja);

                            Ninja withoutNinja = withoutClanNinjasRecords.get(optionIndex);
                            System.out.println(updatedWithoutClanNinja.getInfoSquare());
                            System.out.println(updatedWithoutClanNinja.getName() + " is updated");

                            updatedRecordsNumber++;

                        } else {
                            System.out.println("❌ Invalid index");
                        }

                    }

                    break;
                case 3:
                   clan = RegisterNinja.getClan(input);

                    optionIndex = RegisterNinja.getIdxFromOption(input);

                    if(clan.equals("Uzumaki")){
                        isValidIndex = optionIndex >= 0 && optionIndex < uzumakiClanNinjasRecords.size();

                        if (isValidIndex) {
                            Uzumaki uzumakiNinja = uzumakiClanNinjasRecords.get(optionIndex);
                            System.out.println(uzumakiNinja.getInfoSquare());

                            uzumakiClanNinjasRecords.remove(optionIndex);
                            System.out.println(uzumakiNinja.getInfoSquare());
                            System.out.println(uzumakiNinja.getName() + " is removed");

                            deletedRecordsNumber++;

                        } else {
                            System.out.println("❌ Invalid index");
                        }

                    }

                    if(clan.equals("Uchiha")){
                        isValidIndex = optionIndex >= 0 && optionIndex < uchihaClanNinjasRecords.size();

                        if (isValidIndex) {
                            Uchiha uchihaNinja = uchihaClanNinjasRecords.get(optionIndex);
                            System.out.println(uchihaNinja.getInfoSquare());

                            uchihaClanNinjasRecords.remove(optionIndex);
                            System.out.println(uchihaNinja.getInfoSquare());
                            System.out.println(uchihaNinja.getName() + " is removed");

                            deletedRecordsNumber++;

                        } else {
                            System.out.println("❌ Invalid index");
                        }

                    }

                    if(clan.equals("Hyuga")){
                        isValidIndex = optionIndex >= 0 && optionIndex < hyugaClanNinjasRecords.size();

                        if (isValidIndex) {
                            Hyuga hyugaNinja = hyugaClanNinjasRecords.get(optionIndex);
                            System.out.println(hyugaNinja.getInfoSquare());

                            hyugaClanNinjasRecords.remove(optionIndex);
                            System.out.println(hyugaNinja.getInfoSquare());
                            System.out.println(hyugaNinja.getName() + " is removed");

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
                            System.out.println(ninja.getInfoSquare());
                            System.out.println(ninja.getName() + " is removed");

                            deletedRecordsNumber++;

                        } else {
                            System.out.println("❌ Invalid index");
                        }
                    }


                    break;
                case 4:
                    if(!uzumakiClanNinjasRecords.isEmpty()){
                        for (int i = 0; i < uzumakiClanNinjasRecords.size(); i++) {
                            int listItem = i + 1;
                            System.out.println("\n " + listItem + ". Ninja clãn Uzumaki:");
                            System.out.println(uzumakiClanNinjasRecords.get(i).getInfoSquare());
                        }
                    }

                    if(!uchihaClanNinjasRecords.isEmpty()){
                        for (int i = 0; i < uchihaClanNinjasRecords.size(); i++) {
                            int listItem = i + 1;
                            System.out.println("\n " + listItem + ". Ninja clãn Uchiha:");
                            System.out.println(uchihaClanNinjasRecords.get(i).getInfoSquare());
                        }
                    }

                    if(!hyugaClanNinjasRecords.isEmpty()){
                        for (int i = 0; i < hyugaClanNinjasRecords.size(); i++) {
                            int listItem = i + 1;
                            System.out.println("\n " + listItem + ". Ninja clãn Hyuga:");
                            System.out.println(hyugaClanNinjasRecords.get(i).getInfoSquare());
                        }
                    }

                    if(!withoutClanNinjasRecords.isEmpty()){
                        for (int i = 0; i < withoutClanNinjasRecords.size(); i++) {
                            int listItem = i + 1;
                            System.out.println("\n " + listItem + ". Ninja without clan:");
                            System.out.println(withoutClanNinjasRecords.get(i).getInfoSquare());
                        }
                    }

                    if(!uzumakiClanNinjasRecords.isEmpty()
                            && !uchihaClanNinjasRecords.isEmpty()
                            && !hyugaClanNinjasRecords.isEmpty()
                            && !withoutClanNinjasRecords.isEmpty()
                    ) {
                        System.out.println("You don't register anyone in list");
                    }
                    break;
                case 5:
                    clan = RegisterNinja.getClan(input);

                    optionIndex = RegisterNinja.getIdxFromOption(input);

                    if(clan.equals("Uzumaki")){
                        isValidIndex = optionIndex >= 0 && optionIndex < uzumakiClanNinjasRecords.size();

                        if (isValidIndex) {
                            Uzumaki uzumakiNinja = uzumakiClanNinjasRecords.get(optionIndex);
                            
                            Mission mission = RegisterMission.createMission(input);
                            
                            Uzumaki updatedUzumakiNinja = new Uzumaki(
                                    uzumakiNinja.name,
                                    uzumakiNinja.age,
                                    uzumakiNinja.level,
                                    uzumakiNinja.specialSkill,
                                    uzumakiNinja.clan,
                                    mission
                            );

                            uzumakiClanNinjasRecords.set(optionIndex, updatedUzumakiNinja);

                            System.out.println(updatedUzumakiNinja.getInfoSquare());
                            System.out.println(updatedUzumakiNinja.getName() + " is updated");

                            updatedRecordsNumber++;

                        }  else {
                            System.out.println("❌ Invalid index");
                        }

                    }
                    
                    if(clan.equals("Uchiha")){
                        isValidIndex = optionIndex >= 0 && optionIndex < uchihaClanNinjasRecords.size();

                        if (isValidIndex) {
                            Uchiha uchihaNinja = uchihaClanNinjasRecords.get(optionIndex);
                            
                            Mission mission = RegisterMission.createMission(input);
                            
                            Uchiha updatedUchihaNinja = new Uchiha(
                                    uchihaNinja.name,
                                    uchihaNinja.age,
                                    uchihaNinja.level,
                                    uchihaNinja.specialSkill,
                                    uchihaNinja.clan,
                                    mission
                            );

                            uchihaClanNinjasRecords.set(optionIndex, updatedUchihaNinja);

                            System.out.println(updatedUchihaNinja.getInfoSquare());
                            System.out.println(updatedUchihaNinja.getName() + " is updated");

                            updatedRecordsNumber++;

                        }  else {
                            System.out.println("❌ Invalid index");
                        }

                    }
                    
                    if(clan.equals("Hyuga")){
                        isValidIndex = optionIndex >= 0 && optionIndex < hyugaClanNinjasRecords.size();

                        if (isValidIndex) {
                            Hyuga hyugaNinja = hyugaClanNinjasRecords.get(optionIndex);
                            
                            Mission mission = RegisterMission.createMission(input);
                            
                            Hyuga updatedHyugaNinja = new Hyuga(
                                    hyugaNinja.name,
                                    hyugaNinja.age,
                                    hyugaNinja.level,
                                    hyugaNinja.specialSkill,
                                    hyugaNinja.clan,
                                    mission
                            );

                            hyugaClanNinjasRecords.set(optionIndex, updatedHyugaNinja);

                            System.out.println(updatedHyugaNinja.getInfoSquare());
                            System.out.println(updatedHyugaNinja.getName() + " is updated");

                            updatedRecordsNumber++;

                        }  else {
                            System.out.println("❌ Invalid index");
                        }

                    }

                    break;

                case 6:
                    clan = RegisterNinja.getClan(input);

                    optionIndex = RegisterNinja.getIdxFromOption(input);

                    if(clan.equals("Uzumaki")){
                        isValidIndex = optionIndex >= 0 && optionIndex < uzumakiClanNinjasRecords.size();

                        if (isValidIndex) {
                            Uzumaki uzumakiNinja = uzumakiClanNinjasRecords.get(optionIndex);

                            Status status = RegisterMission.updateMissionStatus(input);

                            if(uzumakiNinja.currentMission == null){
                                System.out.println("You must register a mission first");
                            }

                            Mission missionUpdated =  new Mission(
                                    uzumakiNinja.currentMission.getName(),
                                    status,
                                    uzumakiNinja.currentMission.getRank()
                            );

                            Uzumaki updatedUzumakiNinja = new Uzumaki(
                                    uzumakiNinja.name,
                                    uzumakiNinja.age,
                                    uzumakiNinja.level,
                                    uzumakiNinja.specialSkill,
                                    uzumakiNinja.clan,
                                    missionUpdated
                            );

                            uzumakiClanNinjasRecords.set(optionIndex, updatedUzumakiNinja);

                            System.out.println(uzumakiNinja.getInfoSquare());
                            System.out.println(uzumakiNinja.getName() + " is updated");

                            updatedRecordsNumber++;

                        }  else {
                            System.out.println("❌ Invalid index");
                        }

                    }

                    if(clan.equals("Uchiha")){
                        isValidIndex = optionIndex >= 0 && optionIndex < uchihaClanNinjasRecords.size();

                        if (isValidIndex) {
                            Uchiha uchihaNinja = uchihaClanNinjasRecords.get(optionIndex);

                            Status status = RegisterMission.updateMissionStatus(input);

                            if(uchihaNinja.currentMission == null){
                                System.out.println("You must register a mission first");
                            }

                            Mission missionUpdated = new Mission(
                                    uchihaNinja.currentMission.getName(),
                                    status,
                                    uchihaNinja.currentMission.getRank()
                            );

                            Uchiha updatedUchihaNinja = new Uchiha(
                                    uchihaNinja.name,
                                    uchihaNinja.age,
                                    uchihaNinja.level,
                                    uchihaNinja.specialSkill,
                                    uchihaNinja.clan,
                                    missionUpdated
                            );

                            uchihaClanNinjasRecords.set(optionIndex, updatedUchihaNinja);

                            System.out.println(updatedUchihaNinja.getInfoSquare());
                            System.out.println(updatedUchihaNinja.getName() + " is updated");

                            updatedRecordsNumber++;

                        }  else {
                            System.out.println("❌ Invalid index");
                        }

                    }

                    if(clan.equals("Hyuga")){
                        isValidIndex = optionIndex >= 0 && optionIndex < hyugaClanNinjasRecords.size();

                        if (isValidIndex) {
                            Hyuga hyugaNinja = hyugaClanNinjasRecords.get(optionIndex);

                            Status status = RegisterMission.updateMissionStatus(input);

                            if(hyugaNinja.currentMission == null){
                                System.out.println("You must register a mission first");
                            }

                            Mission missionUpdated = new Mission(
                                    hyugaNinja.currentMission.getName(),
                                    status,
                                    hyugaNinja.currentMission.getRank()
                            );

                            Hyuga updatedHyugaNinja = new Hyuga(
                                    hyugaNinja.name,
                                    hyugaNinja.age,
                                    hyugaNinja.level,
                                    hyugaNinja.specialSkill,
                                    hyugaNinja.clan,
                                    missionUpdated
                            );

                            hyugaClanNinjasRecords.set(optionIndex, updatedHyugaNinja);

                            System.out.println(updatedHyugaNinja.getInfoSquare());
                            System.out.println(updatedHyugaNinja.getName() + " is updated");

                            updatedRecordsNumber++;

                        }  else {
                            System.out.println("❌ Invalid index");
                        }

                    }

                    break;

                case 7:
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
