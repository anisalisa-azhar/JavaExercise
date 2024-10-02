//SUPERCLASS
class Vehicle {
    String make;
    String model;
    int year;
    double rentalPricePerDay;

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
}

