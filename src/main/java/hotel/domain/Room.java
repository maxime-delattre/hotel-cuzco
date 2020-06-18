package hotel.domain;

public class Room {
    private Integer id;
    private Integer floorNumber;
    private String description;
    private Integer capacity;

    public Room(Integer id, Integer floorNumber, String description, Integer capacity) {
        this.id = id;
        this.floorNumber = floorNumber;
        this.description = description;
        this.capacity = capacity;
    }

    // @Override
    // public String toString() {
    //     return "| Floor | Room | Description                                                                | Capacity |" +
    //     "|:-----:|:----:|----------------------------------------------------------------------------|:--------:|" +
    //     "| " +  this.floorNumber + " | " + this.id + "|" + this.description + " | " + this.capacity + " guests |"
    // }
}