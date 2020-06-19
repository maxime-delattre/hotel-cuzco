package hotel.core.usecases;

import hotel.core.domain.Room;
import hotel.core.usecases.ports.RoomProvider;

import java.time.LocalDate;
import java.util.List;

public class GetAvailableRooms {

    public static final int MINIMUM_ALLOWED_NIGHTS = 1;

    private RoomProvider roomProvider;

    public GetAvailableRooms(RoomProvider roomProvider) {
        this.roomProvider = roomProvider;
    }


    public List<Room> execute(LocalDate startDate, LocalDate endDate, int passengerNumber) {
        if (startDate.equals(endDate) || endDate.isBefore(startDate)) {
            endDate = startDate.plusDays(MINIMUM_ALLOWED_NIGHTS);
        }

        return this.roomProvider.getAvailableRooms(startDate, endDate, passengerNumber);
    }
}
