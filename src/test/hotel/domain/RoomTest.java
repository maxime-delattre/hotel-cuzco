package hotel.domain;

import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoomTest {
    
    @Test
    public void should_return_detail_of_room() {
        //Given
        Room room = new Room(101, 2, "belle chambre exposée sud", 2);
        //when
        String actualString = room.toString();
        //Then
        String expectedString = "| 2 | 101 | belle chambre exposée sud | 2 guests |";
        Assertion.assertThat(actualString, expectedString);
    }
}