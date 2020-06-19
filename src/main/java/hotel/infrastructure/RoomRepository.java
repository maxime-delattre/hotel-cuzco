package hotel.infrastructure;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import hotel.core.domain.Room;
import hotel.core.usecases.ports.RoomProvider;

public class RoomRepository implements RoomProvider {

    private final Room room1 = new Room(101, 1, " 1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible   ", 2);
    private final Room room2 = new Room(102, 1," 2 queen size beds - A/C - Wi-Fi - private bathroom - wheelchair accessible ",4);
    private final Room room3 = new Room(103, 1," 3 single beds - A/C - Wi-Fi - private bathroom - wheelchair accessible     ",3);
    private final Room room4 = new Room(201, 2," 1 king size bed - A/C - Wi-Fi - private bathroom                           ",2);

    @Override
    public List<Room> getAll() {
        return List.of(
                room1,
                room2,
                room3,
                room4
        );
    }

    @Override
    public List<Room> getAvailableRooms(LocalDate startDate, LocalDate endDate, int passengerNumber) {
        return List.of(
                room1,
                room2,
                room3,
                room4
        ).stream().filter(room -> room.getCapacity() >= passengerNumber).collect(Collectors.toList());
    }
}
