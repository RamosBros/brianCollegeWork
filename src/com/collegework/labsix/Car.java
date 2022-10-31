package src.com.collegework.labsix;
import java.util.Scanner;



public class Car {
    Scanner userInput = new Scanner(System.in);

    public Car(String make, String model, int year, double MPG, int milesDriven, int fuelCapacity, int fuelRemaining) {
    }

    public double fillTank(double g, int fuelRemaining, int fuelCapacity) {
        if ((g + fuelRemaining) > fuelCapacity) {
            System.out.println("can not add more than car's fuel capacity");
        }
        fuelRemaining = (int) (g + fuelRemaining);
        return fuelRemaining;
    }

    public double drive(double m, double MPG, int fuelRemaining) {
        double gallonsUsed = (m / MPG);
        fuelRemaining = (int)(fuelRemaining - gallonsUsed);
        return fuelRemaining;
    }

    public String toString(){

        return "0";
    }
}
