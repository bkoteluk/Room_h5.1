package pl.homework.lib;

public class AirConditioner {
//    wydojność klimatyzatora - liczba metrów sześciennych,
//    dla których jest w stanie obniżyć temperaturę o 1 stopień w jednostce czasu
    double capability;

    public AirConditioner() {
    }

    public AirConditioner(double capability) {
        setCapability(capability);
    }

    public double getCapability() {
        return capability;
    }

    public void setCapability(double capability) {
        this.capability = capability;
    }

    public double calculateCapability(double cubature) {
//        do wyliczenia sprawności klimatyzatora stosuję funkcję liniową capability/cubature + 0,5 (straty)
        return (capability/cubature + 0.5);
    }
}
