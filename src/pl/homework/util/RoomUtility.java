package pl.homework.util;

import pl.homework.lib.Room;

public class RoomUtility {
    public String roomInfo(Room room) {
        return "pokój  - temperatura: " + room.getTemperature() + ". Obniżenie temperatury: "
                + (room.temperatureReduction()?"powiodło się.":"nie powiodło się.") +
                " Obecnie jest: " + room.getTemperature() + " stopni";
    }
}
