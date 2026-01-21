/* Rock - Paper - Scissors Game in Java */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame {

    enum Choice {
        ROCK, PAPER, SCISSORS;

        //Method to get random choice
        private static final Random rand = new Random();
        
        public static Choice getRandomChoice() {
            Choice[] values = Choice.values(); // built in enum method which returns array of all enum constants
            // value[0] = Choice.ROCK
            return values[rand.nextInt(values.length)];
        }
    }

    public static void showChoice(String player, Choice choice) {
        System.out.println(player + " chooses " + choice);
    }

    //Method to determine winner
    public static String determineWinner(Choice player, Choice computer) {
        if (player == computer) {
            return "It's a tie!";
        } else if ((player == Choice.ROCK && computer == Choice.SCISSORS) ||
                    (player == Choice.PAPER && computer == Choice.ROCK) ||
                    (player == Choice.SCISSORS && computer == Choice.PAPER)) {
            return "Player wins!";
        } else {
            return "Computer wins!";
        }
    }

public static void main(String[] args) {
    //Ask user for their input

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your choice (ROCK, PAPER, SCISSORS): ");
    String input = scanner.nextLine().toUpperCase();

    Choice userChoice; 

    try {

        userChoice = Choice.valueOf(input);

    }
    catch(IllegalArgumentException e) {

        System.out.println("Invalid choice! - Default to rock");
        userChoice = Choice.ROCK;

    }

    //Random computer choice
    Choice computerChoice = Choice.getRandomChoice();

    showChoice("Player", userChoice);
    showChoice("Computer", computerChoice);

    String winner = determineWinner(userChoice, computerChoice);
    System.out.println(winner);
    scanner.close();
}
}