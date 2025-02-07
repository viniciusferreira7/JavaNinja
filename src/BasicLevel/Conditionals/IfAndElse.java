package BasicLevel.Challenges.Conditionals;

public class IfAndElse {
    public static void main(String[] args) {
        String name = "Naruto Uzumaki";
        String ranking;
        int age = 16;
        boolean isHokage = false;
        short amountMissions = 10;

        if (amountMissions >= 10 && age >= 15){
            System.out.println("Rank: Chunnin");
        } else if (amountMissions >= 20) {
            System.out.println("Rank: Jounin");

        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
