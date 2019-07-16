package pl.homework.lib;

public class Room {
    private double surfaceSize;
    private double temperature;
    private boolean airConditioner;

    public Room() {
    }

    public Room(double surfaceSize, double temperature) {
        setSurfaceSize(surfaceSize);
        setTemperature(temperature);
    }

    public Room(double surfaceSize, double temperature, boolean airConditioner) {
        this(surfaceSize, temperature);
        setAirConditioner(airConditioner);
    }

    public double getSurfaceSize() {
        return surfaceSize;
    }

    public void setSurfaceSize(double surfaceSize) {
        this.surfaceSize = surfaceSize;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }
}
