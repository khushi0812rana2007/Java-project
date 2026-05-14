import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HostelApp {
    private Hostel hostel;
    private ArrayList<Room> rooms;

    public HostelApp() {
        hostel = new Hostel();
        rooms = new ArrayList<>();
        Room room101 = new Room(101, "Single");
        Room room102 = new Room(102, "Double");
        Room room103 = new Room(103, "Triple");
        Room room104 = new Room(104, "Single");
        Room room105 = new Room(105, "Double");
        Room room106 = new Room(106, "Triple");
        Room room107 = new Room(107, "Single");
        Room room108 = new Room(108, "Double");
        Room room109 = new Room(109, "Triple");
        rooms.add(room101);
        rooms.add(room102);
        rooms.add(room103);
        rooms.add(room104);
        rooms.add(room105);
        rooms.add(room106);
        rooms.add(room107);
        rooms.add(room108);
        rooms.add(room109);
        hostel.addRoom(room101);
        hostel.addRoom(room102);
        hostel.addRoom(room103);
        hostel.addRoom(room104);
        hostel.addRoom(room105);
        hostel.addRoom(room106);
        hostel.addRoom(room107);
        hostel.addRoom(room108);
        hostel.addRoom(room109);

        JFrame frame = new JFrame("Hostel Booking App");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextArea output = new JTextArea(15, 40);
        JButton showBtn = new JButton("Show Rooms");
        JButton allocateBtn = new JButton("Allocate Rooms");
        JButton releaseBtn = new JButton("Empty Rooms");

        showBtn.addActionListener(e -> {
            output.setText("");
            for(Room r : rooms) {
                output.append("Room " + r.getRoomNumber() + " (" + r.getType() + ")" +
                    (r.isOccupied() ? " [Occupied]\n" : " [Available]\n"));
            }
        });
        allocateBtn.addActionListener(e -> {
            hostel.allocateRoom(101, new UGStudent("Harshita"));
            output.append("Room 101 allocated to Harshita.\n");
        });
        allocateBtn.addActionListener(e -> {
            hostel.allocateRoom(102, new UGStudent("Diksha"));
            output.append("Room 102 allocated to Diksha.\n");
        });
        allocateBtn.addActionListener(e -> {
            hostel.allocateRoom(103, new UGStudent("Priya"));
            output.append("Room 103 allocated to Priya.\n");
        });

        releaseBtn.addActionListener(e -> {
            hostel.emptyRoom(101);
            output.append("Rooms from 104 to 109 are empty.\n");
        });
        frame.add(showBtn);
        frame.add(allocateBtn);
        frame.add(releaseBtn);
        frame.add(new JScrollPane(output));

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new HostelApp();
    }
}

