package hotel.core.usecases;

import hotel.core.domain.Room;
import hotel.core.usecases.ports.RoomProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetAvailableRoomsTest {

    @Mock
    private RoomProvider roomProvider;

    @InjectMocks
    private GetAvailableRooms getAvailableRooms;

    @Test
    void should_return_available_rooms() {
        // arrange
        LocalDate startDate = LocalDate.of(2020, 6, 20);
        LocalDate endDate = LocalDate.of(2020, 6, 30);
        int passengerNumber = 3;

        var room1 = new Room(101, 1, "blue room", 2);
        var room2 = new Room(201, 2, "red room", 4);
        when(this.roomProvider.getAvailableRooms(startDate, endDate, passengerNumber)).thenReturn(List.of(room1, room2));

        // act
        List<Room> availableRoomsObtained = this.getAvailableRooms.execute(startDate, endDate, passengerNumber);

        // assert
        var room1Expected = new Room(101, 1, "blue room", 2);
        var room2Expected = new Room(201, 2, "red room", 4);
        var roomsAvailableExpected = List.of(room1Expected, room2Expected);

        assertThat(availableRoomsObtained).isEqualTo(roomsAvailableExpected);
    }

    @Test
    void should_return_available_rooms_for_1_night_when_user_look_for_less_than_minimum_night_allowed() {
        // arrange
        LocalDate startDate = LocalDate.of(2020, 6, 20);
        int passengerNumber = 3;

        var room1 = new Room(101, 1, "blue room", 2);
        var room2 = new Room(201, 2, "red room", 4);
        when(this.roomProvider.getAvailableRooms(startDate, startDate.plusDays(1), passengerNumber))
                .thenReturn(List.of(room1, room2));

        // act
        List<Room> availableRoomsObtained = this.getAvailableRooms.execute(startDate, startDate, passengerNumber);

        // assert
        var room1Expected = new Room(101, 1, "blue room", 2);
        var room2Expected = new Room(201, 2, "red room", 4);
        var roomsAvailableExpected = List.of(room1Expected, room2Expected);

        assertThat(availableRoomsObtained).isEqualTo(roomsAvailableExpected);
    }

}
