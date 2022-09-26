package src.com.collegework.labtwo;
/*
public class AGame {
import scanner and random function
--> private static final Scanner INPUT = new Scanner(System.in);
--> private static final Random RAND = new Random();
private static class main(String[] args){
int rndPlay=0;
int compWon=0;
int userWon=0;
System.out.println("RULES")
create function for rules
--> Rules();
System.out.println("would user like to play");
String userInput = INPUT.next();

while(userInput.equals("y")){
rndPlay++;
if(CompWins){
compWon++;
system.out.println("computer wins");
} else {
userWon++;
system.out.println("User wins");
}
System.out.println("Would yo like to play again?")
userInput=INPUT.next();
}
print stats usings println(rndplay, compwon, etc)
}
create several functions,

checkIfINputvalid
use switch to make cleaner and test.test several cases,
if boolean is returned as true allow input
if false, prompt user again

Rules
simple, several print statements of the rules

ComputerMove
int randNmb generate random number
switch statement to assign moves to different random integers.
return compMove

whoWins
evaluate the several cases based on rules.
Conditional statements && and ||.
severla if, else if statements.

isCompWinner
take in inputs from user and computer uses function to compare whoWins and check who wins
print out if computer wins.
}
 */

import java.util.Scanner;
import java.util.Random;

public class LabTwo {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final Random RAND = new Random();
    private static final String PERSHULT = "pershult";
    private static final String KLYKET = "klyket";
    private static final String TJUSIG = "tjusig";
    private static final String SKADIS = "skadis";
    private static final String HOVOLM = "hovolm";

    public static void main(String[] aassasda) {
        int roundsPlayed = 0;
        int userRoundsWon = 0;
        int computerRoundsWon = 0;

        System.out.println("The rules of the game are as follows!: ");
        printRules();

        System.out.println("Would you like to play a round?");
        String userInput = INPUT.next();

        while (userInput.equals("y")) {
            roundsPlayed++;
            if (isComputerWinner()) {
                computerRoundsWon++;
                System.out.println("Computer wins!");
            } else {
                userRoundsWon++;
                System.out.println("User wins!");
            }
            System.out.println("Would you like to play again?");
            userInput = INPUT.next();
        }
        System.out.println("Total rounds played!: " + roundsPlayed);
        System.out.println("Total times user won!: " + userRoundsWon);
        System.out.println("Total times the computer won: " + computerRoundsWon);
    }

    public static boolean checkIsInputValid(String playerMove) {
        playerMove = playerMove.toLowerCase();

        switch (playerMove) {
            case PERSHULT, TJUSIG, KLYKET, SKADIS, HOVOLM -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    public static void printRules() {
        System.out.println(PERSHULT + " beats " + KLYKET + ", " + SKADIS);
        System.out.println(KLYKET + " beats " + TJUSIG + ", " + HOVOLM);
        System.out.println(TJUSIG + " beats " + PERSHULT + ", " + SKADIS);
        System.out.println(SKADIS + " beats " + HOVOLM + ", " + KLYKET);
        System.out.println(HOVOLM + " beats " + PERSHULT + ", " + TJUSIG);
    }

    public static String computerMove() {
        String computerChoice;
        int randomNumber = RAND.nextInt(4);

        computerChoice = switch (randomNumber) {
            case 0 -> PERSHULT;
            case 1 -> KLYKET;
            case 2 -> TJUSIG;
            case 3 -> SKADIS;
            default -> HOVOLM;
        };
        return computerChoice;
    }

    /**
     * look into hashmaps to clean this up
     */
    public static String whoWins(String playerMove, String compMove) {
        String whoWins;
        String computerWins = "Computer Wins!";
        String playerWins = "Player Wins!";

        if (playerMove.equals(compMove)) {
            whoWins = computerWins;
        } else if (playerMove.equals(PERSHULT) && ((compMove.equals(KLYKET)) || compMove.equals(SKADIS))) {
            whoWins = playerWins;
        } else if (playerMove.equals(KLYKET) && ((compMove.equals(TJUSIG)) || compMove.equals(HOVOLM))) {
            whoWins = playerWins;
        } else if (playerMove.equals(TJUSIG) && ((compMove.equals(PERSHULT)) || compMove.equals(SKADIS))) {
            whoWins = playerWins;
        } else if (playerMove.equals(SKADIS) && ((compMove.equals(HOVOLM)) || compMove.equals(KLYKET))) {
            whoWins = playerWins;
        } else if (playerMove.equals(HOVOLM) && ((compMove.equals(PERSHULT)) || compMove.equals(TJUSIG))) {
            whoWins = playerWins;
        } else {
            whoWins = computerWins;
        }
        return whoWins;
    }

    /**
     * this is going to return boolean based on the winner of the round
     */
    public static boolean isComputerWinner() {
        System.out.println("Please enter a move!: ");
        String playerMove = INPUT.next();

        while (!checkIsInputValid(playerMove)) {
            System.out.println("Please input valid move: ");
            playerMove = INPUT.next();
        }

        String computerMove = computerMove();
        System.out.println("The Computer chooses: " + computerMove);

        String whoWins = whoWins(playerMove, computerMove);

        return whoWins.equals("Computer Wins!");
    }
}

