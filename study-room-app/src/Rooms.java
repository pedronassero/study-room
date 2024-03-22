public class Rooms {
    public String[] rooms;
    public boolean[] status;

    public Rooms(int numRooms) {
        rooms = new String[numRooms];
        status = new boolean[numRooms];

        for (int i = 0; i < numRooms; i++) {
            rooms[i] = "Room " + (i + 1);
            status[i] = true;
        }
    }

    public void displayRooms() {
        System.out.println("Available rooms:");
        for (int i = 0; i < rooms.length; i++) {
            System.out.println(rooms[i] + ": " + (status[i] ? "Available" : "Occupied"));
        }
    }

    public void bookRoom(int roomNumber) {
        if (roomNumber >= 1 && roomNumber <= rooms.length) {
            if (status[roomNumber -1]) {
                status[roomNumber - 1] = false;
                System.out.println("Room " + roomNumber + " booked successfully.");
            } else {
                System.out.println("Room " + roomNumber + " is already booked.");
            }
        } else {
            System.out.println("Invalid room number.");
        }
    }
}
