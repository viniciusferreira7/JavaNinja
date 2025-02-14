package MidLevel.Challenges.ChallengeOn;

public class Uzumaki extends Ninja {
    private final String specialAbility;

    Uzumaki(String name, int age, Level level, String specialSkill, String clan) {
        super(name, age, level, specialSkill, clan);
        this.specialAbility = "Fuuinjutsu (Sealing Techniques)";
    }

    public String getSpecialAbility() {
        return this.specialAbility;
    }

    public String getInfoSquare() {
        String info = String.format(
                "|%-15s|%-5s|%-10s|%-20s|%-15s|%-15s|%-15s|\n",
                "Name", "Age", "Level", "Mission", "Skill", "Ability", "Clan"
        );
        info += "--------------------------------------------------------------\n";
        info += String.format(
                "|%-15s|%-5d|%-10s|%-20s|%-15s|%-15s|%-15s|\n",
                name, age, level.toString().toLowerCase(), currentMission, specialSkill, specialAbility, clan
        );
        return info;
    }
}
