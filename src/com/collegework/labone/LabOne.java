package src.com.collegework.labone;

import java.util.Scanner;

/**
 * This is a class in JAVA
 * <p>
 * To click this link just do [ CTRL + Click it ]
 * <p>
 * <a href="https://www.geeksforgeeks.org/classes-objects-java/">Classes</a>
 */
public class LabOne {
    private int numHW;
    private int numLateDays;
    private int labAttendance;
    private double hwAverageGrade;

    /**
     * These are called class instance variables
     * <a href="https://www.geeksforgeeks.org/difference-between-instance-variable-and-class-variable/">Instance Variables</a>
     * <p>
     * This "private" is called an access modifier, there are four [ public, private, default, package-private/protected ]
     * <a href="https://www.geeksforgeeks.org/access-modifiers-java/">Access Modifiers</a>
     * <p>
     * The word "final" is a non-access modifier
     * <a href="https://www.geeksforgeeks.org/final-keyword-in-java/">Non-Access Modifiers</a>
     */
    private final Scanner CONSOLE = new Scanner(System.in);

    public void startProgram() {
        System.out.println("Homework weight?");
        int hwWeight = CONSOLE.nextInt();

        System.out.println("Exam 1 weight?");
        int exam1Weight = CONSOLE.nextInt();
        int exam2Weight = 100 - (hwWeight + exam1Weight);

        System.out.println("Weight of exam 2: " + exam2Weight);
        System.out.println("Using weights " + hwWeight + " " + exam1Weight + " " + exam2Weight);

        System.out.println("HOMEWORK: ");
        System.out.println("Number of homeworks have you had?");
        numHW = CONSOLE.nextInt();

        System.out.println("What is your average score of all homeworks?");
        hwAverageGrade = CONSOLE.nextDouble();

        if (hwAverageGrade < 0) {
            hwAverageGrade = 0;
        } else if (hwAverageGrade > 10) {
            hwAverageGrade = 10;
        }

        System.out.println("Number of late days used?");
        numLateDays = CONSOLE.nextInt();

        System.out.println("Number of labs you have attended?");
        labAttendance = CONSOLE.nextInt();

        double totalPoints = hwCalc();
        double hwWeightScore;

        if (numHW <= 0) {
            totalPoints = 100;
            System.out.println("Total points: " + totalPoints + "/" + totalPoints);
            hwWeightScore = 1.0 * hwWeight;
        } else {
            double temp = (numHW * 10 + numHW * 4);
            System.out.println("Total points: " + totalPoints + "/" + temp);
            hwWeightScore = totalPoints / temp * hwWeight;
        }

        System.out.printf("Weighted Score:%2f/n", hwWeightScore);
    }

    /**
     * Do you see how this method doesn't take in parameters in the method signature like it did before?
     * <p>
     * That's because now, this method is part of this class, and the class now has instance variables, meaning that
     * our methods in this class have access to those fields and can modify them and use them
     */
    private double hwCalc() {
        double totalPoints = hwAverageGrade * numHW;

        if (numLateDays > numHW / 2.0) {
            totalPoints = totalPoints - (0.10) * (totalPoints);
        } else if (numLateDays == 0) {
            totalPoints = totalPoints + 5;
        }

        if (totalPoints > numHW * 10) {
            totalPoints = numHW * 10;
        }

        totalPoints = totalPoints + (labAttendance * 4);
        return totalPoints;
    }

    private double moreZeroLessZero(double examScore) {
        if (examScore < 0) {
            examScore = 0;
        } else if (examScore > 100) {
            examScore = 100;
        }
        return examScore;
    }
}

