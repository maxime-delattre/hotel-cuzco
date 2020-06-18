package hotel.core.usecases.ports;

import hotel.core.domain.Room;

import java.util.List;

public interface RoomProvider {
    List<Room> getAll();
}
