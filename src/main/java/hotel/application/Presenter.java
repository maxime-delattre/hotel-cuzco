package hotel.application;

import java.util.stream.Collectors;

import hotel.core.usecases.GetAllRooms;
import hotel.core.usecases.GetAvailableRooms;

public class Presenter {

    public Presenter() {
    }

    public String printRooms(GetAllRooms getAllRooms) {

        return 
            "| Floor | Room | Description                                                                | Capacity |\n" +
            "|:-----:|:----:|----------------------------------------------------------------------------|:--------:|\n" + 
            getAllRooms.execute()
                .stream()
                .map(room -> room.prettyPrintDetails())
                .collect(Collectors.joining("\n"));
    }

    public String printAvailbaleRooms(GetAvailableRooms getAvailableRooms) {
        return null;
    }


}
