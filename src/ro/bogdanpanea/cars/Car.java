package ro.bogdanpanea.cars;

public abstract class Car implements Vehicles {

    @Override
    public void start() {

    }

    @Override
    public void drive(double drivenDistance) {

    }

    @Override
    public void stop() {

    }

    public double gearConsumptionFactor(int gear) {

        return 0;
    }

    public void shiftGear(int curentGear) {
    }

    public double getConsumptionOverTheTrip() {

        return 0;
    }

    public double getAvailableFuel() {

        return 0;
    }

    public double getAverageFuelConsumption() {

        return 0;
    }

    public String getFuelType() {
        return null;
    }

}
