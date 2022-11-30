package src.com.collegework.labten;


public class MultipleChoiceQuestion extends FillInTheBlankQuestion {
    String[] possibleAnswers;
    String correctAnswer;
    static final String ANSWER_SYMBOL = "****";

    public MultipleChoiceQuestion(String[] possibleAnswers, String correctAnswer, int points, Difficulty difficulty, int answerSpace, String questionText) {
        super(correctAnswer, points, difficulty, answerSpace, questionText);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }

    public String printQuestion() {
        return display(false);
    }

    @Override
    public String printQuestionAnswer() {
        return display(true);
    }

    private String display(boolean showAnswer) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(questionText);
        stringBuilder.append("\n");

        for (int i = 0; i < possibleAnswers.length - 1; i++) {
            stringBuilder.append(i + 1);

            if (showAnswer && (possibleAnswers[i] == correctAnswer)) {
                stringBuilder.append(ANSWER_SYMBOL);
            }

            stringBuilder.append(possibleAnswers[i]);

            if (showAnswer && (possibleAnswers[i] == correctAnswer)) {
                stringBuilder.append(ANSWER_SYMBOL);
            }

            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
// can do this but not optimal
// String question = questionText;

// for (int j = 0; j < possibleAnswers.length; j++) {
//     question += j + ". " + possibleAnswers[j] + "\n";
// }

// return question;