package hotel.application;

import hotel.core.domain.Room;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PresenterTest {

    @Test
    void should_return_print_rooms_as_string() {
        // arrange
        var room1 = new Room(101, 1, "blue room", 2);
        var room2 = new Room(201, 2, "red room", 4);

        // act
        var stringObtained = new RoomsPresenter().printRooms(List.of(room1, room2));

        // assert
        var stringExpected = "| Floor | Room | Description                                                                | Capacity |\n" +
                            "|:-----:|:----:|----------------------------------------------------------------------------|:--------:|\n" +
                            "|   1   | 101  | blue room  | 2 guests |\n" +
                            "|   2   | 201  | red room  | 4 guests |";
        assertThat(stringObtained).isEqualTo(stringExpected);
    }
}
