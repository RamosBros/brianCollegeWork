package src.com.collegework.labten;
import src.com.collegework.labten.MultipleChoiceQuestion;

import java.util.Arrays;

public class Test extends MultipleChoiceQuestion{
    private Question questions[];
    private int totalPoints;

    public Test(String[] possibleAnswers, String correctAnswer, int points, String difficulty, int answerSpace, String questionText) {
        super(possibleAnswers, correctAnswer, points, difficulty, answerSpace, questionText);
    }

    public String toString(){
        return Arrays.toString(questions) + " " + totalPoints;
    }
}
