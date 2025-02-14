package MidLevel.Challenges.ChallengeOn;

public class Uchiha extends Ninja {
    private final String doujutsu;

    Uchiha(String name, int age, Level level, String specialSkill, String clan){
        super(name, age, level, specialSkill, clan);
        this.doujutsu = "Sharingan";
    }

    public String getDoujutsu(){
        return this.doujutsu;
    }

    public String getInfoSquare() {
        String info = String.format(
                "|%-15s|%-5s|%-10s|%-20s|%-15s|%-15s|%-15s|\n",
                "Name", "Age", "Level", "Mission", "Skill", "Doujutsu", "Clan"
        );
        info += "--------------------------------------------------------------\n";
        info += String.format(
                "|%-15s|%-5d|%-10s|%-20s|%-15s|%-15s|%-15s|\n",
                name, age, level.toString().toLowerCase(), currentMission, specialSkill, doujutsu, clan
        );
        return info;
    }
}
