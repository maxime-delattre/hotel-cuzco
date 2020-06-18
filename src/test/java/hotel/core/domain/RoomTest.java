package hotel.core.domain;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoomTest {
    
    @Test
    public void should_return_detail_of_room() {
        //Given
        var room = new Room(101, 2, "belle chambre exposée sud", 2);

        //when
        var actualString = room.prettyPrintDetails();

        //Then
        var expectedString = "| 2 | 101 | belle chambre exposée sud | 2 guests |";

        assertThat(actualString).isEqualTo(expectedString);
    }
}
