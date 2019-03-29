package ro.bogdanpanea.cars;

public class Logan extends Dacia {

    private static final int FUEL_TANKSIZE = 35;
    private static final String FUEL_TYPE = "motorina";
    private static final byte GEARS = 6;
    private static final double CONSUMPTION_PER_100_KM = 6.8;
    private double availableFuel;
    private int curentGear;
    private byte tireSize = 15;
    private final String chassisNumber;
    private double consumptionOverTheTrip;
    private double distanceOverTheTrip;

    public Logan(double availableFuel, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
    }

    @Override
    public void start() {

        consumptionOverTheTrip = 0;
        System.out.println("Loganul porneste.");

    }

    public String getFuelType() {
        return FUEL_TYPE;
    }

    @Override
    public void drive(double drivenDistance) {
        consumptionOverTheTrip = consumptionOverTheTrip + ((drivenDistance * Logan.CONSUMPTION_PER_100_KM * gearConsumptionFactor(curentGear)) / 100);
        availableFuel = availableFuel - ((drivenDistance * Logan.CONSUMPTION_PER_100_KM * gearConsumptionFactor(curentGear)) / 100);
        distanceOverTheTrip = distanceOverTheTrip + drivenDistance;
        System.out.println("Loganul  merge " + drivenDistance + " de kilometri in treapta a " + curentGear + ".");
    }

    @Override
    public void stop() {

        System.out.println("Loganul s-a oprit.");
    }

    public void shiftGear(int curentGear) {

        this.curentGear = curentGear;
        System.out.println("Loganul  schimba in treapta de viteza numarul " + curentGear + ".");

    }

    public double gearConsumptionFactor(int gear) {

        double gearConsumptionFactor = 1;

        if (gear > 0) {
            for (int i = Logan.GEARS - 1; i >= gear; i--) {

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
