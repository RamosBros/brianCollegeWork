package src.com.collegework.labone;

import java.util.*;

public class LabTwo {

    public static Scanner INPUT = new Scanner(System.in);

    public  void main(String[] args) {
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
            String playerMove = INPUT.next();
            playerMove = inputValid(playerMove);


        }
        if(yn.equals("n")) {
            System.out.println("Total rounds played!: " + rndPlayed);
            System.out.println("Total times user won!: " + userWon);
            System.out.println("Total times the computer won: " + compWon);
        }


    }
    public String inputValid(String playerMove) {
        playerMove.toLowerCase();
        if(playerMove.equals("pershult")) {
            playerMove = "Pershult";
        } else if(playerMove.equals("klyket")) {
            playerMove = "Klyket";
        } else if (playerMove.equals("tjusig")) {
            playerMove = "Skadis";
        } else if (playerMove.equals("hovolm")) {
            playerMove = "Hovolm";
        } else {
            System.out.println("Please input valid move: ");
            playerMove = INPUT.next();
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
}

