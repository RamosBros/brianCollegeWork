package com.collegework.labtwo.lenny;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;


/**
 * just a Test class for what I think could have been done to improve the class a bit
 * <p>
 * The cool thing about this, is that if we want to add more variations or differnt conditions of who wins/loses
 * we simply add it to the combinations.json file and dont need to code any more
 * <p>
 * Remember everything is data, use that to your advantage
 */
public class LennyLabTwo {
    private final Scanner INPUT;
    private final Random RAND;

    /**
     * This would be way better if we had a json file for it,
     * so lets make it
     */
    HashMap<String, List<String>> combinations;

    /**
     * base constructor, look up what this means if you don't know already
     */
    public LennyLabTwo(InputStream inputStream) {
        INPUT = new Scanner(inputStream);
        RAND = new Random();
        try {
            generateVariations();
        } catch (IOException exception) {
            System.out.println("Damn it failed");
            System.out.println(exception);
        }
    }

    public void startLab() {
        int roundsPlayed = 0;
        int userRoundsWon = 0;
        int computerRoundsWon = 0;

        System.out.println("The rules of the game are as follows!: ");
        printRules();

        System.out.println("Would you like to play a round?");
        String userInput = INPUT.next();

        while (userInput.equals("y")) {
            roundsPlayed++;

            if (isPlayerWinner()) {
                userRoundsWon++;
                System.out.println("User wins!");
            } else {
                computerRoundsWon++;
                System.out.println("Computer wins!");
            }

            System.out.println("Would you like to play again?");
            userInput = INPUT.next();
        }

        System.out.println("Total rounds played!: " + roundsPlayed);
        System.out.println("Total times user won!: " + userRoundsWon);
        System.out.println("Total times the computer won: " + computerRoundsWon);
    }

    /**
     * Don't worry about the warning, its a way that java tries to warn about type references
     * <p>
     * Reads in the combinations from the json file and places them in the HashMap object
     *
     * @throws IOException
     */
    private void generateVariations() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        combinations = objectMapper.readValue(new File("src/com/collegework/labtwo/lenny/combinations.json"), HashMap.class);
    }

    private void printRules() {
        for (Map.Entry<String, List<String>> combos : combinations.entrySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(combos.getKey());
            stringBuilder.append(" beats, ");
            for (String beats : combos.getValue()) {
                stringBuilder.append(beats);
                stringBuilder.append(", ");
            }
            System.out.println(stringBuilder);
        }
    }

    private boolean isPlayerWinner() {
        System.out.println("Please enter a move!: ");
        String playerMove = INPUT.next();

        while (!combinations.containsKey(playerMove)) {
            System.out.println("Please input valid move: ");
            playerMove = INPUT.next();
        }

        String computerMove = computerMove();
        System.out.println("The Computer chooses: " + computerMove);

        return checkWinner(playerMove, computerMove);
    }

    /**
     * We are just making this into a method, so we can use junit to test.test our different combos
     */
    public boolean checkWinner(String playerMove, String computerMove) {
        List<String> playerMoveBeats = combinations.get(playerMove);
        return playerMoveBeats.contains(computerMove);
    }

    /**
     * instead of querying for the keySet each round we could probably store that to save computation
     *
     * @return
     */
    private String computerMove() {
        int randomNumber = RAND.nextInt(4);
        return combinations.keySet().toArray()[randomNumber].toString();
    }
}
