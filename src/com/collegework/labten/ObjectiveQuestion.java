package src.com.collegework.labten;

import src.com.collegework.labten.Question;

public class ObjectiveQuestion extends Question {
    public String correctAnswer;

    public ObjectiveQuestion(String correctAnswer, int points, String difficulty, int answerSpace, String questionText){
        super(points, difficulty, answerSpace, questionText);
    }
    public String toString() {
        return points + " " + difficulty + " " + answerSpace + " " + questionText;
    }

    public String toAnswerString() {
        return correctAnswer;
    }

}
