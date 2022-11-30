package src.com.collegework.labten;

public class FillInTheBlankQuestion extends ObjectiveQuestion {
    public FillInTheBlankQuestion(String correctAnswer, int points, Difficulty difficulty, int answerSpace, String questionText) {
        super(correctAnswer, points, difficulty, answerSpace, questionText);
    }

    public String printQuestion() {
        return "_____" + " " + questionText;
    }

    @Override
    public String printQuestionAnswer() {
        return questionText + " " + correctAnswer;
    }
}
