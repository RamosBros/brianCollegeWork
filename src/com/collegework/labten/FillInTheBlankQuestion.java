package src.com.collegework.labten;

public class FillInTheBlankQuestion extends ObjectiveQuestion {
    public FillInTheBlankQuestion(String correctAnswer, int points, String difficulty, int answerSpace, String questionText) {
        super(correctAnswer, points, difficulty, answerSpace, questionText);
    }

    public String toString() {
        return "_____" + " " + questionText;
    }
    public String toAnswerString(){
        return correctAnswer + " " + questionText;
    }
}
