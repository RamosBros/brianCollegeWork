package src.com.collegework.labten;

import java.util.Arrays;

public class MultipleChoiceQuestion extends ObjectiveQuestion{
    String[] possibleAnswers;

    public MultipleChoiceQuestion(String[] possibleAnswers, String correctAnswer, int points, String difficulty, int answerSpace, String questionText){
        super(correctAnswer, points, difficulty, answerSpace, questionText);
    }
    public String toString(){
        return questionText + "\n" + Arrays.toString(possibleAnswers);
    }
    public String toAnswerString(){
        return correctAnswer + " " + questionText;
    }
}
