
package carproject;

public class CarProject {

    public static void main(String[] args) {

        Car myCar = new Car("38 ERU 001", "Toyota Corolla", 15.0, 50.0);

        System.out.println("Initial status:");
        myCar.checkStatus();

        System.out.println("Driving 120 km...");
        myCar.drive(120);
        myCar.checkStatus(); 

      
        System.out.println("Driving 50 km...");
        myCar.drive(50); 

        System.out.println("Refueling 20 liters...");
        myCar.refuel(20);
        myCar.checkStatus();

        
        System.out.println("Refueling 35 liters...");
        myCar.refuel(35); 
        myCar.checkStatus();
    }
}
    
    

