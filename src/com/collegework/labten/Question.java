package src.com.collegework.labten;

public class Question {
    private int points;
    private String difficulty;
    private int answerSpace;
    private String questionText;

    public Question(){
        this.points = points;
        this.difficulty = difficulty;
        this.answerSpace = answerSpace;
        this.questionText = questionText;
    }


    public String toString(){
        return points + " " + difficulty + " " + answerSpace + " " + questionText;
    }


}
