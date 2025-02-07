package BasicLevel.Challenges.Conditionals;

public class Ternary {
    public static void main(String[] args) {
        short missionsAmount = 11;
        String level = (missionsAmount >= 10) ? "This ninja has more than 10 mission" : "This ninja has less than 10 missions";

        System.out.println(level);
    }
}
