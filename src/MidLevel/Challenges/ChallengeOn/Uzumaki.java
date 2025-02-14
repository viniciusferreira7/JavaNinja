package MidLevel.Challenges.ChallengeOn;

public class Uzumaki extends Ninja {
    private final String specialAbility;

    Uzumaki(String name, int age, Level level, String specialSkill, String clan, Mission currentMission) {
        super(name, age, level, specialSkill, clan, currentMission);
        this.specialAbility = "Fuuinjutsu (Sealing Techniques)";
    }

    public String getSpecialAbility() {
        return this.specialAbility;
    }

    public String getInfoSquare() {
        String info = String.format(
                "|%-15s|%-5s|%-10s|%-20s|%-15s|%-15s|%-15s|%-15s|\n",
                "Name", "Age", "Level", "Mission", "Skill", "Ability", "Rank", "Status"
        );
        info += "--------------------------------------------------------------\n";
        info += String.format(
                "|%-15s|%-5d|%-10s|%-20s|%-15s|%-15s|%-15s|%-15s|\n",
                name, age, level.toString().toLowerCase(),
                (currentMission != null ? currentMission.getName() : "No mission"),
                specialSkill,
                specialAbility,
                (currentMission != null ? currentMission.getRank().toString() : "No rank"),
                (currentMission != null ? currentMission.getStatus().toString() : "No status")
        );
        return info;
    }
}
