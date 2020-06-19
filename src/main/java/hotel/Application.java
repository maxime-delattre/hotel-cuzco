package hotel;

import hotel.application.Presenter;
import hotel.core.usecases.GetAllRooms;
import hotel.infrastructure.HotelRepository;

import static java.lang.System.*;

public class Application {

    public static void main(String[] args) {
        out.println(new Presenter(new GetAllRooms(new HotelRepository())).printRooms());
        /**
         * new Presenter().printRooms(new GetAllRooms(new HotelRepository()).execute())
         * new GetAllRooms(new HotelRepository(), new Presenter()).execute())
         * new GetAllRooms(new HotelRepository()).execute(new Presenter())) => []
         */
        // welcome
        // insert start date 
        // insert end date
        // insert capacity
        // display
    }
}
