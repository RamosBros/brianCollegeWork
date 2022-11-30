package src.com.collegework.labten;

public class ObjectiveQuestion extends Question {
    public String correctAnswer;

    public ObjectiveQuestion(String correctAnswer, int points, Difficulty difficulty, int answerSpace, String questionText) {
        super(points, difficulty, answerSpace, questionText);
        this.correctAnswer = correctAnswer;
    }

    public String toAnswerString() {
        return correctAnswer;
    }

    @Override
    public String printQuestionAnswer() {
        return printQuestion() + " : [answer] > " + toAnswerString();
    }
}
