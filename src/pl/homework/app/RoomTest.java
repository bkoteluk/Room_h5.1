package pl.homework.app;

import pl.homework.lib.AirConditioner;
import pl.homework.lib.Room;
import pl.homework.util.RoomUtility;

public class RoomTest {

    public static final double MIN_TEMPERATURE = 21.5;

    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner(8);
        Room room = new Room(20, 2.5, 25.5, airConditioner);
        Room room2 = new Room(20, 2.5, 21, airConditioner);
        Room room3 = new Room(20, 2.5, 23.5);

        RoomUtility roomUtility = new RoomUtility();
        System.out.println("Pierwszy " + roomUtility.roomInfo(room));
        System.out.println("Drugi " + roomUtility.roomInfo(room2));
        System.out.println("Trzeci " + roomUtility.roomInfo(room3));
//        System.out.println("Pokój pierwszy temperatura: " + room.getTemperature() + ". Obniżenie temperatury: "
//                + (room.temperatureReduction()?"powiodło się.":"nie powiodło się.") +
//                " Obecnie jest: " + room.getTemperature() + " stopni" );
//        System.out.println("Pokój drugi temperatura: " + room2.getTemperature() + ". Obniżenie temperatury: "
//                + (room2.temperatureReduction()?"powiodło się.":"nie powiodło się.") +
//                " Obecnie jest: " + room2.getTemperature() + " stopni" );
//        System.out.println("Pokój trzeci temperatura: " + room3.getTemperature() + ". Obniżenie temperatury: "
//                + (room3.temperatureReduction()?"powiodło się.":"nie powiodło się.") +
//                " Obecnie jest: " + room3.getTemperature() + " stopni" );
    }
}
