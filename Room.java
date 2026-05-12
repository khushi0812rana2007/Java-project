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
