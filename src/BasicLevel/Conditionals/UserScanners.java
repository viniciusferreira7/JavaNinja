package BasicLevel.Conditionals;

import java.util.Scanner;

public class UserScanners {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter with your ninja name: ");
        String ninjaName = input.nextLine();

        System.out.println("Enter with your age: ");
        int age = input.nextInt();

        System.out.println("age = " + age + " years");
        System.out.println("ninjaName = " + ninjaName);

        if(age >= 18){
            System.out.println("This ninja is order and he can go to outside of village to do missions");
        } else {
            System.out.println("This ninja is still very young, you must to train more, before you go out of village");
        }

        input.close();

    }
}
