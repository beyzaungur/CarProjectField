
package carproject;

public class Car {
   
    private String plateNumber;
    private String model;
    private double mileage;
    private double fuelLevel;
    private double tankCapacity;

 
    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0.0;
        this.tankCapacity = tankCapacity;

        if (fuelLevel > tankCapacity) {
            this.fuelLevel = tankCapacity;
        } else {
            this.fuelLevel = fuelLevel;
        }
    }


    public void drive(double km) {
        double fuelNeeded = km / 10.0;

        if (this.fuelLevel >= fuelNeeded) {
            this.mileage += km;
            this.fuelLevel -= fuelNeeded;
        } else {
            System.out.println("Not enough fuel for this trip!");
        }
    }

    public void refuel(double amount) {
        if (this.fuelLevel + amount > this.tankCapacity) {
            this.fuelLevel = this.tankCapacity;
            System.out.println("Tank is full, extra fuel discarded.");
        } else {
            this.fuelLevel += amount;
        }
    }

    public void checkStatus() {
        System.out.println("Car Status [" + model + " - " + plateNumber + "]:");
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("Fuel Level: " + fuelLevel + " / " + tankCapacity + " liters");

        if (this.fuelLevel < (this.tankCapacity * 0.10)) {
            System.out.println("Low fuel warning!");
        }
        System.out.println("----------------------------------------");
    }
}   

