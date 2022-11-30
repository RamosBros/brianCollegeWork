package src.com.collegework.labten;

public class Test {
    private Question[] questions;
    private int totalPoints;

    public Test(Question[] questions) {
        this.questions = questions;
        getTotalPoints();
    }

    public String createTest() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < questions.length; i++) {
            stringBuilder.append(i + ". ");
            stringBuilder.append(questions[i].printQuestion());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public String createAnswerKey() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < questions.length; i++) {
            stringBuilder.append(i + ". ");
            stringBuilder.append(questions[i].printQuestionAnswer());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();

    }


    private void getTotalPoints() {
        for (int i = 0; i < questions.length; i++) {
            totalPoints += questions[i].points;
        }
    }
}
