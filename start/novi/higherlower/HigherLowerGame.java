package novi.higherlower;

import java.util.Scanner;

public class HigherLowerGame {
    private Scanner inputScanner;
    private boolean gameIsRunning;

    public HigherLowerGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame() {
        gameIsRunning = true;

        // Here you should generate the number to guess

        int randomNumber = (int)(1 + Math.random() * 100);
        int turns = 0;
        System.out.println(randomNumber);
        System.out.println("Guess a number between 0 and 100");
        while (gameIsRunning) {


//            var input = inputScanner.nextLine();
//            System.out.printf("You typed: %s\n", input);

            // Check if the guess is correct, if so end the game
            int playerInput = inputScanner.nextInt();

            if (playerInput < randomNumber) {
                System.out.println("Higher!");
                turns++;
            } else if (playerInput > randomNumber) {
                System.out.println("Lower!");
                turns++;
            } else {
                System.out.println("You have won! It took you: " + turns + " turns!");
            }
        }
    }
}
