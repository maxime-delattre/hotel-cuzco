package hotel.application;

import java.util.List;
import java.util.stream.Collectors;

import hotel.core.domain.Room;
import hotel.core.usecases.GetAllRooms;
import hotel.core.usecases.GetAvailableRooms;

public class RoomsPresenter {

    public RoomsPresenter() {
    }

    public String printRooms(List<Room> rooms) {
        return 
            "| Floor | Room | Description                                                                | Capacity |\n" +
            "|:-----:|:----:|----------------------------------------------------------------------------|:--------:|\n" + 
            rooms
                .stream()
                .map(Room::prettyPrintDetails)
                .collect(Collectors.joining("\n"));
    }
}
