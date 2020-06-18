package hotel.infrastructure;

import java.util.List;

import hotel.core.domain.Room;
import hotel.core.usecases.ports.RoomProvider;

public class HotelRepository implements RoomProvider {

    @Override
    public List<Room> getAll() {
        List<Room> rooms = List.of(new Room(101, 2, "black room", 2), new Room(102, 1, "green room", 4));
        return rooms;
    }

    
}