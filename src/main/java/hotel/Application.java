package hotel;

import hotel.application.RoomsPresenter;
import hotel.core.usecases.GetAllRooms;
import hotel.core.usecases.GetAvailableRooms;
import hotel.infrastructure.RoomRepository;

import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.System.*;

public class Application {

    public static void main(String[] args) {
        var hotelRepository = new RoomRepository();
        var roomsPresenter = new RoomsPresenter();

        out.println("Welcome to Hotel Cusco");
        var getAllRooms = new GetAllRooms(hotelRepository);
        out.println(roomsPresenter.printRooms(
                getAllRooms.execute()
        ));

        out.println("Search for availalble rooms");
        out.println("Please insert start date (yyyy-MM-dd)  : ");
        var startDate = askDate();

        out.println("Please insert end date (yyyy-MM-dd)  : ");
        var endDate = askDate();

        out.println("Please insert person number : ");
        var personNumber = askNumber();

        out.println("These are the available rooms : ");
        var getAvailableRooms = new GetAvailableRooms(hotelRepository);
        out.println(roomsPresenter.printRooms(
                getAvailableRooms.execute(startDate, endDate, personNumber)
        ));
    }

    private static LocalDate askDate() {
        Scanner sc = new Scanner(System.in);
        String startDateAsString = sc.nextLine();
        return LocalDate.parse(startDateAsString);
    }

    private static int askNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
