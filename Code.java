import java.util.ArrayList;

class Room {
    private int roomNumber;
    private String type;
    private boolean isOccupied;

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isOccupied = false;
    }

    public int getRoomNumber() { return roomNumber; }
    public String getType() { return type; }
    public boolean isOccupied() { return isOccupied; }

    public void allocate() { isOccupied = true; }
    public void  empty() { isOccupied = false; }
}

class Student {
    protected String name;
    public Student(String name) { this.name = name; }
    public void showRole() { System.out.println("I am a hostel student."); }
}

class UGStudent extends Student {
    public UGStudent(String name) { super(name); }
    public void showRole() { System.out.println("I am an undergraduate student."); }
}

class PGStudent extends Student {
    public PGStudent(String name) { super(name); }
    public void showRole() { System.out.println("I am a postgraduate student."); }
}

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

public class Code {
    public static void main(String[] args) {
        Hostel hostel = new Hostel();

        hostel.addRoom(new Room(101, "Single"));
        hostel.addRoom(new Room(102, "Double"));
        hostel.addRoom(new Room(103, "Triple"));
        hostel.addRoom(new Room(104, "Single"));
        hostel.addRoom(new Room(105, "Double"));
        hostel.addRoom(new Room(106, "Triple"));
        hostel.addRoom(new Room(107, "Single"));
        hostel.addRoom(new Room(108, "Double"));
        hostel.addRoom(new Room(109, "Triple"));
        hostel.addRoom(new Room(110, "Single"));
        hostel.addRoom(new Room(111, "Double"));
        hostel.addRoom(new Room(112, "Triple"));

        Student s1 = new UGStudent("Harshita");
        Student s2 = new PGStudent("Rashi");
        Student s3 = new PGStudent("Isha");
        Student s4 = new PGStudent("Priya");
        Student s5 = new PGStudent("Diksha");
        Student s6 = new PGStudent("Diyaa");
        Student s7 = new PGStudent("Rakshita");
        Student s8 = new PGStudent("Ishita");
        Student s9 = new PGStudent("Aman");
        Student s10 = new PGStudent("Ashi");
        Student s11 = new PGStudent("Pragya");
        Student s12 = new PGStudent("Sakshi");

        s1.showRole();
        s2.showRole();
        s3.showRole();
        s4.showRole();
        s5.showRole();
        s6.showRole();
        s7.showRole();
        s8.showRole();
        s9.showRole();
        s10.showRole();
        s11.showRole();
        s12.showRole();

        hostel.showRooms();
        hostel.allocateRoom(101, s1);
        hostel.showRooms();
        hostel.emptyRoom(101);
        hostel.showRooms();
    }
}
