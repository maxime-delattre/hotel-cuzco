package hotel.core.usecases;

import java.time.LocalDate;

import hotel.core.usecases.ports.ReservationProvider;

public class MakeReservation {

    private ReservationProvider reservationProvider;

    public MakeReservation(ReservationProvider reservationProvider) {
        this.reservationProvider = reservationProvider;
    }


    public void execute(LocalDate startDate, LocalDate endDate, int passengerNumber, int roomNumber) {
        // this.reservationProvider.makeAReservation(startDate, endDate, passengerNumber, roomNumber);
    }

} 