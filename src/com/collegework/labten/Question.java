package src.com.collegework.labten;

public class Question {
    // Number of points earned for answering the question correctly.
    public int points;

    // Range of difficulty ranging from the constants MIN_DIFFICULTY to MAX_DIFFICULTY.
    public Difficulty difficulty;

    // Amount of space that should be left on the paper so that the test taker can fill in the answer. 
    // This can be represented as the number of lines on the page.
    public int answerSpace;

    // The text of the question
    public String questionText;

    public Question(int points, Difficulty difficulty, int answerSpace, String questionText) {
        this.points = points;
        this.difficulty = difficulty;
        this.answerSpace = answerSpace;
        this.questionText = questionText;
    }

    // come back to define this statement 
    // For each question, we should be able to create a String representation of the question as it should be presented to the student (for example, during a test or quiz)
    public String toString() {
        return questionText + " " + points + " ";
    }

    public String printQuestion() {
        return questionText;
    }

    public String printQuestionAnswer() {
        return "override this method";
    }
}
