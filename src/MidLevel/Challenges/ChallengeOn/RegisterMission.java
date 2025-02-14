package MidLevel.Challenges.ChallengeOn;

import java.util.Scanner;

public class RegisterMission {
    public static String getName(Scanner input){
        System.out.println("Enter with a name of mission:");
        return input.nextLine();
    }

    public static Status getStatus(Scanner input){
        System.out.println("Enter the status of the mission: ");
        System.out.println("1. Pending");
        System.out.println("2. In_processing");
        System.out.println("3. Completed");
        System.out.println("4. Failed");
        System.out.println("5. Forbidden");
        int statusOption = input.nextInt();
        input.nextLine();

        Status status;

        if(statusOption <= 0 || statusOption > 5){
            System.out.println("❌ Invalid option, you'll start with mission status Pending");
            status = Status.PENDING;
        } else {
            status = Mission.getStatusByOption(statusOption);
        }

        return status;
    }

    public static Rank getRank(Scanner input){
        System.out.println("Enter with rank of mission: ");
        System.out.println("1. S Rank");
        System.out.println("2. A Rank");
        System.out.println("3. B Rank");
        System.out.println("4. C Rank");
        System.out.println("5. D Rank");
        int rankOption = input.nextInt();
        input.nextLine();

        Rank rank;

        if(rankOption <= 0 || rankOption > 3){
            System.out.println("❌ Invalid option, you'll start with mission rank D");
            rank = Rank.D;
        } else {
            rank = Mission.getRankByOption(rankOption);
        }

        return rank;

    }

    public static Mission createMission(Scanner input){
        String name = RegisterMission.getName(input);
        Status status = RegisterMission.getStatus(input);
        Rank rank = RegisterMission.getRank(input);


        return new Mission(name, status, rank);
    }

    public static Status updateMissionStatus(Scanner input){
        Status status = RegisterMission.getStatus(input);

        return status;
    }
}
