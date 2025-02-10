package BasicLevel;

public class Array {
    public static void main(String[] args) {

        // String starts with null
        String[] ninjas = new String[4];
        ninjas[0] = "Naruto";
        ninjas[2] = "Sasuke";
        ninjas[1] = "Sakura";
        System.out.println(ninjas[3]);

        // Int starts with 0
        int[] age = new int[2];
        age[0] = 13;
        System.out.println(age[1]);

        // Boolean starts with false
        boolean[] isNinja = new boolean[2];
        isNinja[0] = true;
        System.out.println(isNinja[1]);

        // Double starts with 0.0
        double[] floatNumber = new double[2];
        System.out.println(floatNumber[0]);
    }
}
