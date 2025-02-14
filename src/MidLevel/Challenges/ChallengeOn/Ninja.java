package MidLevel.Challenges.ChallengeOn;

enum Level {
    GENIN, CHUNIN, JONIN
};

public class Ninja {
    protected final String name;
    protected final int age;
    protected Level level;
    protected Mission currentMission;
    protected String specialSkill;
    protected final String clan;

    Ninja(String name, int age, Level level, String specialSkill, String clan){
        this.name = name;
        this.age = age;
        this.level = level;
        this.specialSkill = specialSkill;
        this.clan = clan;
    }

    public void setSpecialSkill(String specialSkill){
        this.specialSkill = specialSkill;
    }

    public String getSpecialSkill(){
        return specialSkill;
    }

    public void SetCurrentMission(String name, Mission.Status status, Mission.Rank rank){
        this.currentMission = new Mission(name, status, rank);
    }

    public Mission getCurrentMission(){
        return currentMission;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Level getLevel(){
        return level;
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

    public static String getClanByOption(int clanOption){
        if(clanOption == 1){
            return "Uzumaki";
        }

        if(clanOption == 2){
            return "Uchiha";
        }

        if(clanOption == 3){
            return "Hyuga";
        }

        return "wihout clan";

    }

    public String getInfoSquare() {
        String info = String.format(
                "|%-15s|%-5s|%-10s|%-20s|%-15s|\n",
                "Name", "Age", "Level", "Mission", "Skill"
        );
        info += "--------------------------------------------------------------\n";
        info += String.format(
                "|%-15s|%-5d|%-10s|%-20s|%-15s|\n",
                name, age, level.toString().toLowerCase(), currentMission, specialSkill
        );
        return info;
    }

}
