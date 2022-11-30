package src.com.collegework.labten;

public class Driver {
    public static void main(String[] args) {
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(new String[]{"red", "blue"}, "blue", 10, Difficulty.MIN_DIFFICULTY, 1, "What is the color of the sky");
        FillInTheBlankQuestion question2 = new FillInTheBlankQuestion("retail", 15, Difficulty.MAX_DIFFICULTY, 1, " banking technology");
        ObjectiveQuestion question3 = new ObjectiveQuestion("1995", 45, Difficulty.MAX_DIFFICULTY, 1, "What year was Lenny born");
        Question[] test1Questions = new Question[]{question1, question2, question3};


        Test test1 = new Test(test1Questions);
        String realTest = test1.createTest();
        String answerKey = test1.createAnswerKey();
        System.out.println(realTest);
//        System.out.println(answerKey);
    }

}
