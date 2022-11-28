package src.com.collegework.labten;

public class Question {
    public int points;
    public String difficulty;
    public int answerSpace;
    public String questionText;

    public Question(int points, String difficulty, int answerSpace, String questionText) {
        this.points = points;
        this.difficulty = difficulty;
        this.answerSpace = answerSpace;
        this.questionText = questionText;
    }



    public String toString() {
        return points + " " + difficulty + " " + answerSpace + " " + questionText;
    }


}
