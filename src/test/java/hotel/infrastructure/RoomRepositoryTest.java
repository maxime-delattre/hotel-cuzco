package hotel.infrastructure;

import hotel.core.domain.Room;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RoomRepositoryTest {

    @Test
    void should_return_rooms_with_capacity_superior_or_equal_to_passenger_number() {
    	// arrange
        var startDate = LocalDate.of(2020, 6,10);
        var endDate = LocalDate.of(2020, 6,12);
        var passengerNumber = 3;

    	// act
        var availableRoomsObtained = new RoomRepository().getAvailableRooms(startDate, endDate, passengerNumber);

    	// assert
        Room room1Expected = new Room(102, 1," 2 queen size beds - A/C - Wi-Fi - private bathroom - wheelchair accessible ",4);
        Room room2Expected = new Room(103, 1," 3 single beds - A/C - Wi-Fi - private bathroom - wheelchair accessible     ",3);
        assertThat(availableRoomsObtained).isEqualTo(List.of(room1Expected, room2Expected));
    }

}
