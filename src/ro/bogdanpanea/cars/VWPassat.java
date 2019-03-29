package ro.bogdanpanea.cars;

public class VWPassat extends Volkswagen {
    private static final int FUEL_TANKSIZE = 40;

    public String getFuelType() {
        return FUEL_TYPE;
    }

    private static final String FUEL_TYPE = "motorina";
    private static final byte GEARS = 8;
    private static final double CONSUMPTION_PER_100_KM = 9;
    private double availableFuel;
    private int curentGear;
    private byte tireSize = 18;
    private final String chassisNumber;
    private double consumptionOverTheTrip;
    private double distanceOverTheTrip;

    public VWPassat(double availableFuel, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
    }

    @Override
    public void start() {

        consumptionOverTheTrip = 0;
        System.out.println("Pasatul porneste.");

    }


    @Override
    public void drive(double drivenDistance) {
        consumptionOverTheTrip = consumptionOverTheTrip + ((drivenDistance * VWPassat.CONSUMPTION_PER_100_KM * gearConsumptionFactor(curentGear)) / 100);
        availableFuel = availableFuel - ((drivenDistance * VWPassat.CONSUMPTION_PER_100_KM * gearConsumptionFactor(curentGear)) / 100);
        distanceOverTheTrip = distanceOverTheTrip + drivenDistance;
        System.out.println("Pasatul  merge " + drivenDistance + " kilometri in treapta a " + curentGear + " - a.");
    }

    @Override
    public void stop() {

        System.out.println("Pasatul s-a oprit.");
    }

    public void shiftGear(int curentGear) {

        this.curentGear = curentGear;
        System.out.println("Pasatul  schimba in treapta de viteza numarul " + curentGear + ".");

    }

    public double gearConsumptionFactor(int gear) {

        double gearConsumptionFactor = 1;

        if (gear > 0) {
            for (int i = VWPassat.GEARS - 1; i >= gear; i--) {

                gearConsumptionFactor = gearConsumptionFactor * 1.1;
            }
        } else {
            gearConsumptionFactor = 0;
        }
        return gearConsumptionFactor;

    }

    public double getAverageFuelConsumption() {

        return (consumptionOverTheTrip / distanceOverTheTrip) * 100;
    }

    public double getConsumptionOverTheTrip() {
        return consumptionOverTheTrip;
    }

    public double getAvailableFuel() {
        return availableFuel;
    }

}
