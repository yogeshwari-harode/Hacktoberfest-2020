package ChallengeProblems;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Press 1 for Rock !!! \nPress 2 for Paper !!! \nPress 3 for Scissor !!!");
        System.out.printf("\nEnter Your Choice : ");
        int userChoice = sc.nextInt();
        Random rand = new Random();
        int computerChoice = rand.nextInt(4);
        if(userChoice==computerChoice)
            System.out.printf("It is a Draw !!!");
        else if (userChoice == 1 && computerChoice == 3) {
            System.out.printf("Congratulations You Win !!!\n");
            System.out.printf("Computer Chooses Scissor ");
        } else if (userChoice == 2 && computerChoice == 1) {
            System.out.printf("Congratulations You Win !!!\n");
            System.out.printf("Computer Chooses Rock ");
        } else if (userChoice == 3 && computerChoice == 2) {
            System.out.printf("Congratulations You Win !!!\n");
            System.out.printf("Computer Chooses Paper ");
        } else {
            if (userChoice == 3 && computerChoice == 1) {
                System.out.printf("Oh No You Loose !!!\n");
                System.out.printf("Computer Chooses Scissor ");
            } else if (userChoice == 1 && computerChoice == 2) {
                System.out.printf("Oh No You Loose !!!\n");
                System.out.printf("Computer Chooses Rock ");
            } else {
                System.out.printf("Oh No You Loose !!!\n");
                System.out.printf("Computer Chooses Paper ");
            }
        }
        sc.close();
    }
}
