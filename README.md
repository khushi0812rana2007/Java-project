# Hostel Booking App
## Project Structure
```
hostel-booking-app/
└── src/
    └── main/
        └── java/
            └── com/
                └── hostelapp/
                    ├── Main.java         ← Entry point, run this
                    ├── Hostel.java       ← Manages all rooms
                    ├── Room.java         ← Room details & status
                    ├── Student.java      ← Base student class
                    ├── UGStudent.java    ← Undergraduate student
                    └── PGStudent.java    ← Postgraduate student
```

## What Each File Does

| File | Purpose |
|------|---------|
| `Main.java` | Starts the app, ties everything together |
| `Hostel.java` | Add rooms, show rooms, allocate & free rooms |
| `Room.java` | Stores room number, type, and occupied status |
| `Student.java` | Base class for all students |
| `UGStudent.java` | Undergraduate student type |
| `PGStudent.java` | Postgraduate student type |
