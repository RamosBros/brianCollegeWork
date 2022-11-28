package src.com.collegework.labten;
import src.com.collegework.labten.Question;

public class ObjectiveQuestion extends Question{
    private int points;
    private String correctAnswer;
    private String difficulty;
    private int answerSpace;
    private String questionText;

    public ObjectiveQuestion(String correctAnswer, int points, String difficulty, int answerSpace, String questionText){
        this.points = points;
        this.correctAnswer = correctAnswer;
        this.difficulty = difficulty;
        this.answerSpace = answerSpace;
        this.questionText = questionText;
    }
    public String toString(){
        return points + " " + difficulty + " " + answerSpace + " " + questionText;
    }
    public String toAnswerString(){
        return correctAnswer;
    }

}
