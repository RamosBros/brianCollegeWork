package src.com.collegework.labtwo.lenny;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;


/**
 * just a test class for what i think could have been done to improve the class a bit
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

        startLab();
    }

    private void startLab() {
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

    public boolean isComputerWinner() {
        System.out.println("Please enter a move!: ");
        String playerMove = INPUT.next();

        while (!combinations.containsKey(playerMove)) {
            System.out.println("Please input valid move: ");
            playerMove = INPUT.next();
        }

        String computerMove = computerMove();
        System.out.println("The Computer chooses: " + computerMove);

        String whoWins = whoWins(playerMove, computerMove);

        return whoWins.equals("Computer Wins!");
    }

    public String computerMove() {
        int randomNumber = RAND.nextInt(4);
        return combinations.entrySet().toArray()[randomNumber].toString();
    }
}
