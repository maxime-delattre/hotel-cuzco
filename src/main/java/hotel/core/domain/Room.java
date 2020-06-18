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
         return "|   " +  this.floorNumber + "   | " + this.id + "  | " + this.description + "  | " + this.capacity + " guests |";
     }

     @Override
     public boolean equals(Object obj) {
         if (this == obj)
             return true;
         if (obj == null)
             return false;
         if (getClass() != obj.getClass())
             return false;
         Room other = (Room) obj;
         if (capacity == null) {
             if (other.capacity != null)
                 return false;
         } else if (!capacity.equals(other.capacity))
             return false;
         if (description == null) {
             if (other.description != null)
                 return false;
         } else if (!description.equals(other.description))
             return false;
         if (floorNumber == null) {
             if (other.floorNumber != null)
                 return false;
         } else if (!floorNumber.equals(other.floorNumber))
             return false;
         if (id == null) {
             if (other.id != null)
                 return false;
         } else if (!id.equals(other.id))
             return false;
         return true;
     }

     
}
