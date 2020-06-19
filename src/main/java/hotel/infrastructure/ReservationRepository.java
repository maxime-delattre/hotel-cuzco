package hotel.infrastructure;

import java.time.LocalDate;

import hotel.core.usecases.ports.ReservationProvider;

public class ReservationRepository implements ReservationProvider {

    @Override
    public void makeAReservation(LocalDate startDate, LocalDate endDate, int passengerNumber, int roomNumber) {
        // TODO Auto-generated method stub
    }
    

}