package MidLevel.Challenges.ChallengeTwo;

public class AdvancedNinja extends BasicNinja {
    protected final String  specialty;

    public AdvancedNinja(String name, int age, NinjaLevel level, JutsuType jutsuType, String specialty) {
        super(name, age, level, jutsuType);
        this.specialty = specialty;
    }

    @Override
    public String executeSkill() {
        return String.format("%s masters the art of %s, showcasing a remarkable %s technique!", this.name, this.specialty, this.jutsuType);
    }
}
