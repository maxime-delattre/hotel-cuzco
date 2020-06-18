package hotel.core.usecases;

import hotel.core.domain.Room;
import hotel.core.usecases.ports.RoomProvider;

import java.util.List;

public class GetAllRooms {

    private RoomProvider roomProvider;

    public GetAllRooms(RoomProvider roomProvider) {
        this.roomProvider = roomProvider;
    }


    public List<Room> execute() {
        return null;
    }
}
