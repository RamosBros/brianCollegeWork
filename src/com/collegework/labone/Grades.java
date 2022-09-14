/*
Brian Edgardo Ramos-Leiva
CIS 1068, Program Design and Abstraction
9/19/2022

this code takes in several integers from a user (assuming the integers aren't negative)
and computes their grades according to weights, attendance, and exams.
 */
package src.com.collegework.labone;
import java.util.Scanner;
public class Grades {

    public static Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Homework weight?: ");
        int hwWeight = INPUT.nextInt();

        System.out.print("Exam 1 weight?: ");
        int exam1Weight = INPUT.nextInt();
        int exam2Weight = 100 - (hwWeight + exam1Weight);

        System.out.println("Using weights " + hwWeight + " " + exam1Weight + " " + exam2Weight);

        System.out.println("HOMEWORK: ");

        System.out.print("Number of homeworks that you've had: ");
        int numHW = INPUT.nextInt();

        System.out.print("Average score of homeworks?: ");
        double hwGrade = INPUT.nextDouble();
        if (hwGrade < 0) {
            hwGrade = 0;
        } else if (hwGrade > 10) {
            hwGrade = 10;
        }

        System.out.print("Number of late days used?: ");
        int numLateDays = INPUT.nextInt();


        System.out.print("Number of labs you have attended?: ");
        int labAttendance = INPUT.nextInt();


        double totalPoints = hwCalc(numHW, hwGrade, numLateDays, labAttendance);
        double hwWeightScore = 0;

        if (numHW <= 0) {
            totalPoints = 100;
            System.out.println("Total points: " + totalPoints + "/" + totalPoints);
            hwWeightScore = 1.0 * hwWeight;
        } else {
            System.out.println("Total points: " + totalPoints + "/" + (numHW * 10 + numHW * 4));
            hwWeightScore = totalPoints / (numHW * 10 + numHW * 4) * hwWeight;
        }

        System.out.println("Weighted Score: " + hwWeightScore);

        System.out.print("Exam 1 Score?: ");
        double exam1Score = INPUT.nextDouble();

        //adjusts score according to function examConditionB
        exam1Score = examConiditionB(exam1Score);

        //curve
        System.out.print("Curve Amount?: ");
        int exam1Curve = INPUT.nextInt();

        exam1Score += exam1Curve;

        if (exam1Score > 100) {
            exam1Score = 100;
        }
        System.out.println("Total points = " + exam1Score + "/100");

        //Calculating the weighted score
        double exam1WeightScore = exam1Score / 100.0 * exam1Weight;
        System.out.println("Weighted score: " + exam1WeightScore);

        //exam 2 grade
        System.out.println("Weight of exam 2: " + exam2Weight);
        System.out.print("Exam 2 Score?:");
        double exam2Score = INPUT.nextDouble();


        System.out.print("Curve Amount?: ");
        int exam2Curve = INPUT.nextInt();

        //adjusts score according to condition see function below
        exam2Score += exam2Curve;
        exam2Score = examConiditionB(exam2Score);
        double exam2WeightScore = exam2Score / 100.0 * exam2Weight;

        System.out.println("Weighted score: " + exam2WeightScore);

        System.out.println("Total points: " + exam2Score + "/100");

        /*
        final grade
         */
        double courseGrade = hwWeightScore + exam1WeightScore + exam2WeightScore;
        System.out.println("Course grade: " + courseGrade);

    }

    // calculates total points based on number of late days and other factors

    public static double hwCalc(int numHW, double hwGrade, int numLateDays, int labAttendance) {
        double totalPoints = hwGrade * numHW;
        if (numLateDays > (numHW) / 2.0) {
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

    // checks if values are below zero or above a hundred and corrects them
    public static double examConiditionB(double examScore) {
        if (examScore < 0) {
            examScore = 0;
        } else if (examScore > 100) {
            examScore = 100;
        }
        return examScore;
    }
}

