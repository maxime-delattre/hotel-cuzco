package hotel.core.domain;

public class Room {
    private final Integer id;
    private final Integer floorNumber;
    private final String description;
    private final Integer capacity;

    public Room(Integer id, Integer floorNumber, String description, Integer capacity) {
        this.id = id;
        this.floorNumber = floorNumber;
        this.description = description;
        this.capacity = capacity;
    }

     public String prettyPrintDetails() {
         return "| " +  this.floorNumber + " | " + this.id + " | " + this.description + " | " + this.capacity + " guests |";
     }
}
