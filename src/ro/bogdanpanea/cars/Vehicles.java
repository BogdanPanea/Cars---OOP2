package ro.bogdanpanea.cars;

public interface Vehicles {

    public void start();

    public void drive(double drivenDistance);

    public void stop();

    public void shiftGear(int curentGear);
}
