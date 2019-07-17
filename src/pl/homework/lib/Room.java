package pl.homework.lib;

import static pl.homework.app.RoomTest.MIN_TEMPERATURE;

public class Room {
    private double surfaceSize;
//    Pole określające wysokoćś pomieszczenia umożliwi wyliczenie kubatury : surfaceSize*height
    private double height;
    private double temperature;
//    private boolean airConditioner;  - pole typu boolean zamieniam na objekt AirConditioner
    private AirConditioner airConditioner;

    public Room() {
    }

    public Room(double surfaceSize,double height, double temperature) {
        this.height= height;
        this.surfaceSize = surfaceSize;
        this.temperature = temperature;
    }

    public Room(double surfaceSize,double height, double temperature, AirConditioner airConditioner) {
        this(surfaceSize, height, temperature);
        this.airConditioner = airConditioner;
//        setTemperature(temperature);
    }

//    public Room(double surfaceSize, double temperature, boolean airConditioner) {
//        this(surfaceSize, temperature);
//        setAirConditioner(airConditioner);
//    }

    public double getSurfaceSize() {

        return surfaceSize;
    }

    public void setSurfaceSize(double surfaceSize) {

        this.surfaceSize = surfaceSize;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public double getTemperature() {

        return temperature;
    }

    public void setTemperature(double temperature) {

        this.temperature = temperature;
    }

//    public boolean isAirConditioner() {
//
//        return airConditioner;
//    }
//
//    public void setAirConditioner(boolean airConditioner) {
//
//        this.airConditioner = airConditioner;
//    }

    public boolean temperatureReduction() {
        if (getTemperature() > MIN_TEMPERATURE && this.airConditioner != null) {
            setTemperature(getTemperature()-airConditioner.calculateCapability(surfaceSize*height));
            return true;
        } else {
            return false;
        }

    }
}
