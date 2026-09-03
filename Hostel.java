import java.util.ArrayList;
class Hostel {
    private ArrayList<Room> rooms = new ArrayList<>();
    public void addRoom(Room r) {
        rooms.add(r);
    }
    public void showRooms() {
        for(Room r : rooms) {
            System.out.println("Room " + r.getRoomNumber() + " (" + r.getType() + ")" +
                (r.isOccupied() ? " [Occupied]" : " [Available]"));
        }
    }
    public void allocateRoom(int roomNumber, Student s) {
        for(Room r : rooms) {
            if(r.getRoomNumber() == roomNumber && !r.isOccupied()) {
                r.allocate();
                System.out.println("Room " + roomNumber + " allocated to " + s.name);
                return;
            }
        }
        System.out.println("Room not available.");
    }
    public void emptyRoom(int roomNumber) {
        for(Room r : rooms) {
            if(r.getRoomNumber() == roomNumber && r.isOccupied()) {
                r.empty();
                System.out.println("Room " + roomNumber + " empty.");
                return;
            }
        }
        System.out.println("Room not found or already free.");
    }
}
