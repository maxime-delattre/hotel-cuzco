package hotel.core.usecases;

import hotel.core.domain.Room;
import hotel.core.usecases.ports.RoomProvider;

import java.time.LocalDate;
import java.util.List;

public class GetAvailableRooms {

    private RoomProvider roomProvider;

    public GetAvailableRooms(RoomProvider roomProvider) {
        this.roomProvider = roomProvider;
    }


    public List<Room> execute(LocalDate startDate, LocalDate endDate, int passengerNumber) {
        return this.roomProvider.getAvailableRooms(startDate, endDate, passengerNumber);
    }
}
