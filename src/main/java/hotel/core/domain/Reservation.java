package hotel.core.domain;

import java.time.LocalDate;

public class Reservation {
    private Integer roomNumber;
    private LocalDate chekInDate;
    private LocalDate checkOutDate;

    public Reservation(Integer roomNumber, LocalDate chekInDate, LocalDate checkOutDate) {
        this.roomNumber = roomNumber;
        this.chekInDate = chekInDate;
        this.checkOutDate = checkOutDate;
    }

    

}