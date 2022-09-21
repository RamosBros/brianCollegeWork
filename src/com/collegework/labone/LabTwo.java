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
            System.out.println("Please enter a move!: ");
            String playerMove = INPUT.nextLine().toLowerCase();
            playerMove = inputValid(playerMove);
            System.out.println("The computer chooses: ");
            String whoWins = WhoWins(playerMove, CompMove());
            System.out.println(whoWins);


        }
        if(yn.equals("n")) {
            System.out.println("Total rounds played!: " + rndPlayed);
            System.out.println("Total times user won!: " + userWon);
            System.out.println("Total times the computer won: " + compWon);
        }


    }
    /* is this more readable ?
    aka switch statements B)
     */
    public static String inputValid(String playerMove) {
        switch (playerMove) {
            case "pershult" -> playerMove = "Pershult";
            case "klyket" -> playerMove = "Klyket";
            case "tjusig" -> playerMove = "Tjusig";
            case "skadis" -> playerMove = "Skadis";
            case "hovolm" -> playerMove = "Hovolm";
            default -> {
                System.out.println("Please input valid move: ");
                playerMove = INPUT.next();
            }
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
        compMove = switch (randomNumber) {
            case 0 -> "Perhsult";
            case 1 -> "Klyket";
            case 2 -> "Tjusig";
            case 3 -> "Skadis";
            default -> "Hovolm";
        };
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
}

