package ChallengeProblems;

import java.util.Random;
import java.util.Scanner;

class Game {
    int numberOfGuesses = 0;
    int computerNumber;
    int userNumber;

    public Game() {
        Random rand = new Random();
        computerNumber = rand.nextInt(100);
    }

    public void setUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nEnter the Number : !!!");
        int userNumber = sc.nextInt();
        Logic(userNumber);
        sc.close();
    }

    public void Logic(int n) {
        while (n != computerNumber) {
            if (n < computerNumber) {
                System.out.printf("Sorry !!! The Computer Number is Greater than Yours");
                numberOfGuesses++;
                setUserInput();
            } else if (n > computerNumber) {
                System.out.printf("Sorry !!! The Computer Number is Smaller than Yours ");
                numberOfGuesses++;
                setUserInput();
            } else
                System.out.printf("Congratulations !!! it is a match ");
            break;
        }

    }

    public int getGuesses() {
        return numberOfGuesses;
    }
}

public class tellTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        g.setUserInput();
        int res = g.getGuesses();
        System.out.printf("You need %d guesses to find the Correct Output !!!", res);

    }

}
