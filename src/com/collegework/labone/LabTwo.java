package src.com.collegework.labone;

import java.util.*;

public class LabTwo {

    public static Scanner INPUT = new Scanner(System.in);
    public static Random RAND = new Random();
    public static void main(String[] args) {
        int rndPlayed = 0;
        int userWon = 0;
        int compWon = 0;
        System.out.println("The rules of the game are as follows!: ");
        Rules();

        System.out.println("Would you like to play a round?");
        String yn = INPUT.next();
        while(yn.equals("y")) {
            rndPlayed++;
            play_a_round();
            yn = INPUT.next();
//            System.out.println("The computer chooses: ");
//            CompMove();
//            String whoWins = WhoWins(playerMove, CompMove());
//            System.out.println(whoWins);


        }
        if(yn.equals("n")) {
            System.out.println("Total rounds played!: " + rndPlayed);
            System.out.println("Total times user won!: " + userWon);
            System.out.println("Total times the computer won: " + compWon);
        }


    }
    public static String inputValid(String playerMove) {
        playerMove.toLowerCase();
        if(playerMove.equals("pershult")) {
            playerMove = String.valueOf(true);
        } else if(playerMove.equals("klyket")) {
            playerMove = String.valueOf(true);
        } else if (playerMove.equals("tjusig")) {
            playerMove = String.valueOf(true);
        } else if (playerMove.equals("skadis")) {
            playerMove = String.valueOf(true);
        } else if (playerMove.equals("hovolm")) {
            playerMove = String.valueOf(true);
        } else {
            playerMove = String.valueOf(false);
        }
        return playerMove;
    }
    public static void Rules()  {
        System.out.println("Pershult beats Klyket, Skadis");
        System.out.println("Klyket beats Tjusig, Hovolm");
        System.out.println("Tjusig beats Pershult, Skadis");
        System.out.println("Skadis Beats Hovolm, Klyket");
        System.out.println("Hovolm beats Pershult, Tjusig");
    }
    public static String CompMove() {
        String compMove = "placeholder";
        int randomNumber = RAND.nextInt(5);
        if (randomNumber == 0) {
            compMove = "Perhsult";
        } else if (randomNumber == 1) {
            compMove = "Klyket";

        } else if (randomNumber == 2) {
            compMove = "Tjusig";
        } else if (randomNumber == 3) {
            compMove = "Skadis";
        } else {
            compMove = "Hovolm";
        }
        System.out.println(compMove);
        return compMove;
    }
    public static String WhoWins(String playerMove, String compMove) {
        String whoWins = "placeholder";
        if (playerMove.equals(compMove)) {
            whoWins = "Computer Wins!";
        } else if (playerMove.equals("pershult") && compMove.equals("Klyket") || compMove.equals("Skadis")) {
            whoWins = "Player Wins!";
        } else if (playerMove.equals("klyket") && compMove.equals("Tjusig") || compMove.equals("Hovolm")) {
            whoWins = "Player Wins!";
        } else if (playerMove.equals("tjusig") && compMove.equals("Perhsult") || compMove.equals("Skadis")) {
            whoWins = "Player Wins!";
        } else if (playerMove.equals("skadis") && compMove.equals("Hovolm") || compMove.equals("Klyket")) {
            whoWins = "Player Wins!";
        } else if (playerMove.equals("hovolm") && compMove.equals("Pershult") || compMove.equals("Tjusig")) {
            whoWins = "Player Wins!";
        } else {
            whoWins = "Computer Wins!";
        }
        return whoWins;

    }
    public static void play_a_round() {
        System.out.println("Please enter a move!: ");
        String playerMove = INPUT.next();
        String validResult = inputValid(playerMove);
        while (validResult == String.valueOf(false)) {
            System.out.println("Please input valid move: ");
            playerMove = INPUT.next();
            validResult = inputValid(playerMove);
        }
        System.out.println("The Computer chooses: ");
        String whoWins = WhoWins(playerMove, CompMove());
        System.out.println(whoWins);
        System.out.println("Would you like to play again?");
    }
}

