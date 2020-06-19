package hotel.application;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import org.mockito.Mock;

import hotel.core.domain.Room;
import hotel.core.usecases.GetAllRooms;
import hotel.core.usecases.GetAvailableRooms;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class PresenterTest {

    @Mock
    private GetAllRooms getAllRooms;

    @Mock
    private GetAvailableRooms getAvailableRooms;

    @Test
    void should_return_print_rooms_as_string() {
        // arrange
        var room1 = new Room(101, 1, "blue room", 2);
        var room2 = new Room(201, 2, "red room", 4);
        when(this.getAllRooms.execute()).thenReturn(List.of(room1, room2));

        // act
        var presenter = new Presenter(this.getAllRooms);

        // assert
        var expectedPrint = "| Floor | Room | Description                                                                | Capacity |\n" +
                            "|:-----:|:----:|----------------------------------------------------------------------------|:--------:|\n" +
                            "|   1   | 101  | blue room  | 2 guests |\n" +
                            "|   2   | 201  | red room  | 4 guests |";
        assertThat(presenter.printRooms()).isEqualTo(expectedPrint);
    }

    @Test
    void should_return_available_rooms_as_string() {
        // Given
        LocalDate startDate = LocalDate.of(2020, 6, 20);
        LocalDate endDate = LocalDate.of(2020, 6, 30);
        int passengerNumber = 3;

        var room1 = new Room(101, 1, "blue room", 2);
        var room2 = new Room(201, 2, "red room", 4);
        when(this.getAvailableRooms.execute(startDate, endDate, passengerNumber)).thenReturn(List.of(room1, room2));

        // When
        var presenter = new Presenter(this.getAvailableRooms);

        //Then
    }
}
