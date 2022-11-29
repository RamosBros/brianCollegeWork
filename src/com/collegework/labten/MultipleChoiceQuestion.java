package src.com.collegework.labten;

import java.util.Arrays;

public class MultipleChoiceQuestion extends FillInTheBlankQuestion{
    String[] possibleAnswers;
    String answer;

    public MultipleChoiceQuestion(String[] possibleAnswers, String correctAnswer, int points, String difficulty, int answerSpace, String questionText){
        super(correctAnswer, points, difficulty, answerSpace, questionText);
        this.possibleAnswers = possibleAnswers;
        this.answer = correctAnswer;
    }
    public String toString(){
        return questionText + "\n" + Arrays.toString(possibleAnswers);
    }
    public String toAnswerString(){
        return questionText + " " + correctAnswer;
    }
}
