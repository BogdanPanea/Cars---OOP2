package ro.bogdanpanea.cars;

public class Main {

    public static void main(String[] args) {

//        //Car car = new Car(); // This should not compile.
//
//        //Car car = new Dacia(27, "oiqe0934hkkadsn"); // This should not compile! If I want to create a Dacia car, I will need to create an instance of a Dacia model.
//
//        Car car = new VWGolf(27, "oiqe0934hkkadsn"); // Logan can extend from Dacia, while Dacia extends from Car
//
//        car.start();
//
//        car.shiftGear(1);
//
//        car.drive(0.01);// drives 0.01 KMs
//
//        car.shiftGear(2);
//
//        car.drive(0.02);
//
//        car.shiftGear(3);
//
//        car.drive(0.5);
//
//        car.shiftGear(4);
//
//        car.drive(0.5);
//
//        car.shiftGear(4);
//
//        car.drive(0.5);
//
//        car.shiftGear(5);
//
//        car.drive(10);
//
//        car.shiftGear(4);
//
//        car.drive(0.5);
//
//        car.shiftGear(3);
//
//        car.drive(0.1);
//
//        car.stop();
//
//        float availableFuel = (float) car.getAvailableFuel();
//        System.out.println("In rezervor au mai ramas : " + availableFuel + " de litri de " + car.getFuelType());
//
//        float fuelConsumedPer100Km = (float) car.getAverageFuelConsumption();
//        System.out.println("Consumul mediu in aceasta calatorie a fost de : " + fuelConsumedPer100Km + " de litri de " + car.getFuelType() + " la o suta de kilometri.");


        Vehicles vehicle = new VWPassat(30, "1987ddkshik289"); //available fuel and chassis number

        vehicle.start();

        vehicle.shiftGear(1);

        vehicle.drive(0.01);

        vehicle.shiftGear(2);

        vehicle.drive(0.01);

        vehicle.shiftGear(3);

        vehicle.drive(0.01);

        vehicle.shiftGear(4);

        vehicle.drive(1);

        vehicle.shiftGear(5);

        vehicle.drive(100);

        vehicle.stop();

        Car car = (Car) vehicle;

        float availableFuel = (float) car.getAvailableFuel();
        System.out.println("In rezervor au mai ramas : " + availableFuel + " de litri de " + car.getFuelType());

        float fuelConsumedPer100Km = (float) car.getAverageFuelConsumption();
        System.out.println("Consumul mediu in aceasta calatorie a fost de : " + fuelConsumedPer100Km + " de litri de " + car.getFuelType() + " la o suta de kilometri.");


    }
}
