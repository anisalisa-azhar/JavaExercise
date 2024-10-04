//SUPERCLASS
class Vehicle {
    String make;
    String model;
    int year;
    double rentalPricePerDay;

    //constructor
    public Vehicle (String make, String model, int year, double rentalPricePerDay){
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalPricePerDay = rentalPricePerDay;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public double getRentalPricePerDay(){
        return rentalPricePerDay;
    }
    public double calculateRentalCost(int days){
        return (rentalPricePerDay * days);
    }
}
//SUB CLASS CAR
class Car extends Vehicle {
    private int numSeats;
    private int numDoors;

    public Car(String make, String model, int year, double rentalPricePerDay, int numSeats, int numDoors){
        super(make, model, year, rentalPricePerDay);
        this.numSeats = numSeats;
        this.numDoors = numDoors;
    }

    public int getNumSeats(){
        return numSeats;
    }
    public int getNumDoors(){
        return numDoors;
    }
}

//SUB CLASS MOTOCYCLE
class Motorcycle extends Vehicle {
    private int engineSize;

    public Motorcycle(String make, String model, int year, double rentalPricePerDay, int engineSize){
        super(make, model, year, rentalPricePerDay);
        this.engineSize = engineSize;
    }
    public int getEngineSize(){
        return engineSize;
    }
}

    public class MainVehicle {

        public static void main(String[] args) {
            Car car = new Car("Toyota", "Vios", 1990, 100.00, 5, 4);
            System.out.println("Car Make: " + car.getMake());
            System.out.println("Car Model: " + car.getModel());
            System.out.println("Car Year: " + car.getYear());
            System.out.println("Car Rental Price Per Day: RM " + car.getRentalPricePerDay());
            System.out.println("Car numbers of seats: " + car.getNumSeats());
            System.out.println("Car numbers of doors: " + car.getNumDoors());
            System.out.println("Rental cost for 5 days is: RM " + car.calculateRentalCost(5));
            
            Motorcycle motorcycle = new Motorcycle("Modenas", "E39", 1998, 30.0, 345);
            System.out.println("Motorcycle Make: " + motorcycle.getMake());
            System.out.println("Motorcycle Model: " + motorcycle.getModel());
            System.out.println("Motorcycle Year: " + motorcycle.getYear());
            System.out.println("Motorcycle Rental Price Per Day: " + motorcycle.getRentalPricePerDay());
            System.out.println("Motorcycle size of engine" + motorcycle.getEngineSize());
            System.out.println("Rental cost for 5 days is: RM " + motorcycle.calculateRentalCost(5));
    
        }
    }

