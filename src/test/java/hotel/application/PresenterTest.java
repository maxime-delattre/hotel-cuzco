package hotel.application;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import org.mockito.Mock;

import hotel.core.domain.Room;
import hotel.core.usecases.GetAllRooms;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class PresenterTest {

    @Mock
    private GetAllRooms getAllRooms;

    @Test
    void should_display_print_rooms() {
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

}
