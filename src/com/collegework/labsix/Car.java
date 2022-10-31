package src.com.collegework.labsix;
public class Car {
    private String make;
    private String model;
    private int year;
    private double MPG;
    private int milesDriven;
    private int fuelCapacity;
    private int fuelRemaining;

    public Car(String make, String model, int year, double MPG, int milesDriven, int fuelCapacity, int fuelRemaining) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.MPG = MPG;
        this.milesDriven = milesDriven;
        this.fuelCapacity = fuelCapacity;
        this.fuelRemaining = fuelRemaining;
    }

    public double fillTank(double additionalGas) {
        double sumOfGas = (additionalGas + fuelRemaining);
        if (sumOfGas > fuelCapacity) {
            System.out.println("can not add more than car's fuel capacity");
        }
        fuelRemaining = (int) sumOfGas;
        return fuelRemaining;
    }

    public double drive(double m) {
        double gallonsUsed = (m / MPG);
        fuelRemaining = (int)(fuelRemaining - gallonsUsed);
        return fuelRemaining;
    }

    public String toString() {
            return make + " " + model + " " + year + " " + MPG + " " + milesDriven + " " + fuelCapacity + " " + fuelRemaining;
    }
    public int getFuelRemaining(){
        return fuelRemaining;
    }
}
