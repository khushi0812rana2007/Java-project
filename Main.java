public class Main {
    public static void main(String[] args) {
        Hostel hostel = new Hostel();

        hostel.addRoom(new Room(101, "Single"));
        hostel.addRoom(new Room(102, "Double"));
        hostel.addRoom(new Room(103, "Triple"));

        Student s1 = new UGStudent("Harshita");
        Student s2 = new PGStudent("Rashi");

        s1.showRole();
        s2.showRole();

        hostel.showRooms();
        hostel.allocateRoom(101, s1);
        hostel.showRooms();
        hostel.emptyRoom(101);
        hostel.showRooms();
    }
}
