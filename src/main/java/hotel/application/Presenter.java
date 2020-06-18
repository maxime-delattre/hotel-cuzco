package hotel.application;

import java.util.stream.Collectors;

import hotel.core.usecases.GetAllRooms;

public class Presenter {

    private final GetAllRooms getAllRooms;

    public Presenter(GetAllRooms getAllRooms) {
        this.getAllRooms = getAllRooms;
    }

    public String printRooms() {

        return "| Floor | Room | Description                                                                | Capacity |\n" +
        "|:-----:|:----:|----------------------------------------------------------------------------|:--------:|\n" + 
        this.getAllRooms.execute()
            .stream()
            .map(room -> room.prettyPrintDetails())
            .collect(Collectors.joining("\n"));
    }


}
