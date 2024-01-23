import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {
    public static void main(String[] args) {

        System.out.print("Choose [r]ock, [p]aper, [s]cissors:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String playerMove = userInput;

        if (playerMove.equals("r") || playerMove.equals("rock")) {
           playerMove = ROCK;
            System.out.println(playerMove);
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = SCISSORS;
            System.out.println(playerMove);
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
           playerMove = PAPER;
            System.out.println(playerMove);
        } else {
            System.out.println("Invalid input. Try again...");
            return;
        }

        Random random = new Random();
        int computerRandom = random.nextInt(4);
        String computerMove = " ";

        switch (computerRandom) {
            case 1:
                computerMove = ROCK;
                break;
            case 2:
                computerMove = SCISSORS;
                break;
            case 3:
                computerMove = PAPER;
                break;
        }

        System.out.printf("The computer chose %s%n", computerMove);

        if ((playerMove.equals("rock") && computerMove.equals("scissors")) || (playerMove.equals("scissors") && computerMove.equals("paper")) || (playerMove.equals("paper") && computerMove.equals("rock"))) {
            System.out.println("You win.");
        } else if ((computerMove.equals("scissors") && (playerMove.equals("rock")) || (playerMove.equals("rock") && computerMove.equals("paper")) || (playerMove.equals("paper") && computerMove.equals("scissors")))) {
            System.out.println("You lose.");
        } else {
            System.out.println("The game was a draw.");
        }

        System.out.println("Play again:");


    }
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";
    }
