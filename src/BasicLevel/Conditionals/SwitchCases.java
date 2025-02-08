package BasicLevel.Conditionals;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Chose a character: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");


        int userChoice = userInput.nextInt();

        System.out.println("You enter with number " + userChoice);

        switch (userChoice){
            case 1:
                System.out.println("You chose Naruto Uzumaki");
                break;
            case 2:
                System.out.println("You chose Sasuke Uchiha");;
                break;
            case 3:
                System.out.println("You chose Sakura Haruno");
                break;
            default:
                System.out.println("You need provide a number with range is 1 a 3");
        }


        userInput.close();
    }
}
