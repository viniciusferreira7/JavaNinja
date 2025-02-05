package Challenges;

enum Rank {
    S, A, B, C, D;
}

enum StatusMission {
    PENDING, IN_PROCESSING, COMPLETED, FAILED, FORBIDDEN
}

class Mission {
    private final String name;
    private final Rank rank;
    private StatusMission statusMission;

    Mission(String name, Rank rank, StatusMission statusMission) {
        this.name = name;
        this.rank = rank;
        this.statusMission = statusMission;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public StatusMission getStatusMission() {
        return statusMission;
    }

    public void setStatusMission(StatusMission statusMission) {
        if (statusMission == StatusMission.PENDING) {
            this.statusMission = StatusMission.IN_PROCESSING;
            return;
        }

        if (statusMission == StatusMission.IN_PROCESSING) {
            this.statusMission = StatusMission.COMPLETED;
            return;
        }

        this.statusMission = statusMission;
    }
}

class Ninja {
    private final String name;
    private int age;

    Ninja(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mission createMission(String name, Rank rank, StatusMission statusMission) {
        return new Mission(name, rank, statusMission);
    }
}

public class ChallengeOne {
    public static void main(String[] args) {
        Ninja naruto = new Ninja("Naruto Uzumaki", 15);
        Ninja sasuke = new Ninja("Sasuke Uchiha", 15);
        Ninja sakura = new Ninja("Sakura Haruno", 15);

        Mission narutoMission = naruto.createMission("Training with Jiraya", Rank.C, StatusMission.IN_PROCESSING);
        Mission sasukeMission = sasuke.createMission("Kill a certain someone", Rank.S, StatusMission.FAILED);
        Mission sakuraMission = sakura.createMission("Learn medicine with Tsunade", Rank.C, StatusMission.PENDING);

        Ninja[] ninjas = {naruto, sasuke, sakura};
        Mission[] missions = {narutoMission, sasukeMission, sakuraMission};

        for (int i = 0; i < 3; i++) {
            System.out.println("\nNinja: " + ninjas[i].getName() + "; age: " + ninjas[i].getAge() + " years");
            System.out.println("Mission: " + missions[i].getName() + "; Rank: " + missions[i].getRank() + "; status: " + missions[i].getStatusMission().toString().toLowerCase());

            if (ninjas[i].getAge() <= 15 && (missions[i].getRank() == Rank.S || missions[i].getRank() == Rank.A || missions[i].getRank() == Rank.B)) {
                missions[i].setStatusMission(StatusMission.FORBIDDEN);
                System.out.println("Mission change status to: " + StatusMission.FORBIDDEN.toString().toLowerCase() + " to " + ninjas[i].getName());
            } else {
                StatusMission statusMissionForNinja = missions[i].getStatusMission();
                missions[i].setStatusMission(statusMissionForNinja);
                System.out.println("Mission change status to: " + missions[i].getStatusMission().toString().toLowerCase() + " to " + ninjas[i].getName());
            }

            if(i <= 1) {
                System.out.println("------------------------------");
            }
        }
    }
}
