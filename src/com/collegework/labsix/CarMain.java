package src.com.collegework.labsix;

import java.sql.SQLOutput;

public class CarMain {
    public static void main(String[] args){
        Car[] carObjects = new Car[8];
        carObjects[0] = new Car("Bugatti","Veyron",2013,9.5,5000,18,9);
        carObjects[1] = new Car("Toyota", "Camry", 2008, 30.5, 157000, 30, 15);
        carObjects[0].drive(5);
        carObjects[0].fillTank(9);
        System.out.println(carObjects[0].getFuelRemaining());
        System.out.println(carObjects[0]);
        carObjects[1].toString();
        carObjects[1].drive(30);
        carObjects[1].fillTank(14);
        System.out.println(carObjects[1].getFuelRemaining());
        System.out.println(carObjects[1]);

    }
}
