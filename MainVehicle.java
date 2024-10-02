

public class MainVehicle {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Vios", 1990, 100.00, 5, 4);
        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());
        System.out.println("Car Rental Price Per Day: RM " + car.getRentalPricePerDay());
        System.out.println("Rental cost for 5 days is: RM " + car.calculateRentalCost(5));
        
        Motorcycle motorcycle = new Motorcycle("Modenas", "E39", 1998, 30.0, 345);
        System.out.println("Motorcycle Make: " + motorcycle.getMake());
        System.out.println("Motorcycle Model: " + motorcycle.getModel());
        System.out.println("Motorcycle Year: " + motorcycle.getYear());
        System.out.println("Motorcycle Rental Price Per Day: " + motorcycle.getRentalPricePerDay());
        System.out.println("Rental cost for 5 days is: RM " + car.calculateRentalCost(5));

    }
}
