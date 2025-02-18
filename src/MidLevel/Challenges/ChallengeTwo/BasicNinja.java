package MidLevel.Challenges.ChallengeTwo;

public class BasicNinja implements Ninja {
    protected final String name;
    protected final int age;
    protected final NinjaLevel level;
    protected final JutsuType jutsuType;

    public BasicNinja(String name, int age, NinjaLevel level, JutsuType jutsuType) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.jutsuType = jutsuType;
    }


    @Override
    public String getInformation() {
        return String.format("\nName: %s, Age: %d, Level: %s, Jutsu Type: %s",
                name, age, level, jutsuType);

    }

    @Override
    public String executeSkill() {
        return String.format("%s unleashes a powerful %s technique!", this.name, this.jutsuType);
    }

}
