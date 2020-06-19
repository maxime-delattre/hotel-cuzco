package hotel.core.usecases.ports;

import hotel.core.domain.Room;

import java.time.LocalDate;
import java.util.List;

public interface RoomProvider {
    List<Room> getAll();

    List<Room> getAvailableRooms(LocalDate startDate, LocalDate endDate, int passengerNumber);
}
