package hotel.core.usecases;

import hotel.core.domain.Room;
import hotel.core.usecases.ports.RoomProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetAllRoomsTest {

    @Mock
    private RoomProvider roomProvider;

    @Test
    void should_return_all_rooms() {
    	// arrange
        var room1 = new Room(101, 1, "blue room", 2);
        var room2 = new Room(201, 2, "red room", 4);
        when(this.roomProvider.getAll()).thenReturn(List.of(room1, room2));

        var getAllRooms = new GetAllRooms(roomProvider);

    	// act
        var roomsObtained = getAllRooms.execute();

    	// assert
        var room1Expected = new Room(101, 1, "blue room", 2);
        var room2Expected = new Room(201, 2, "red room", 4);
        var roomsExpected = List.of(room1Expected, room2Expected);

        assertThat(roomsObtained).isEqualTo(roomsExpected);
    }

}
