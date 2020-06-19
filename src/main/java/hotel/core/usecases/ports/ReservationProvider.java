package hotel.core.usecases.ports;
import java.time.LocalDate;

public interface ReservationProvider {
    
    void makeAReservation(LocalDate startDate, LocalDate endDate, int passengerNumber, int roomNumber);
}