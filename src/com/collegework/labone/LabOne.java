package src.com.collegework.labone;

import java.util.Scanner;
public class LabOne {
    public static Scanner CONSOLE = new Scanner(System.in);
            System.out.println("Homework weight?");
            int hwWeight = CONSOLE.nextInt();
            System.out.println("Exam 1 weight?");
            int exam1Weight = CONSOLE.nextInt();
            int exam2Weight = 100 - (hwWeight + exam1Weight);
            System.out.println("Weight of exam 2: " + exam2Weight);
            System.out.println("Using weights " + hwWeight + " " + exam1Weight + " " + exam2Weight);

            System.out.println("HOMEWORK: ");
            System.out.println("Number of homeworks have you had?");
            int numHW = CONSOLE.nextInt();
            System.out.println("What is your average score of all homeworks?");
            double hwGrade = CONSOLE.nextDouble();
            if(hwGrade < 0) {
                hwGrade = 0;
            } else if(hwGrade > 10) {
                hwGrade = 10;
            }
            System.out.println("Number of late days used?");
            int numLateDays = CONSOLE.nextInt();
            System.out.println("Number of labs you have attended?");
            int labAttendance = CONSOLE.nextInt();

            double totalPoints = hwCalc(numHW, hwGrade, numLateDays, labAttendance);
            double hwWeightScore = 0;

            if(numHW <= 0) {
                totalPoints = 100;
                System.out.println("Total points: " + totalPoints + "/" + totalPoints);
                hwWeightScore = totalPoints/totalPoints*hwWeight;
            } else {
                System.out.println("Total points: " + totalPoints + "/" + (numHW * 10 + numHW  * 4));
                hwWeightScore = totalPoints/(numHW * 10 + numHW * 4) * hwWeight;
            }
            System.out.printf("Weighted Score:%2f/n",hwWeightScore);


        }

        public static double hwCalc(int numHW, double hwGrade, int numLateDays, int labAttendance) {
            double totalPoints = hwGrade * numHW;
            if(numLateDays>(numHW)/2.0) {
                totalPoints = totalPoints - (0.10)*(totalPoints);
            } else if(numLateDays == 0) {
                totalPoints = totalPoints + 5;
            }
            if(totalPoints > numHW * 10) {
                totalPoints = numHW * 10;
            }
            totalPoints = totalPoints + (labAttendance * 4);
            return totalPoints;
        }
        public static double moreZeroLessZero (double examScore) {
            if(examScore < 0) {
                examScore = 0;
            } else if (examScore > 100) {
                examScore = 100;
            }
            return examScore;
        }
    }

}
