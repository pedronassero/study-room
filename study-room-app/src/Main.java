import java.util.Scanner;
import jdk.jshell.SourceCodeAnalysis;

public class Main {
    public static void main(String[] args) {
        Users registers = new Users();
        Scanner scanner = new Scanner(System.in);
        Rooms rooms = new Rooms(15);

        boolean logged = false;
        boolean app = true;
        while (app) {
            int choice = 0;
            while (choice < 1 || choice > 4) {
                System.out.println("1 - Login");
                System.out.println("2 - Register");
                System.out.println("3 - Room Availability");
                System.out.println("4 - Book Room");
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice < 1 || choice > 4) {
                    System.out.println("Option not found.");
                }
            }

            String username;
            String password;
            switch (choice) {
                case 1:
                    System.out.print("Username: ");
                    username = scanner.nextLine();
                    System.out.println(" ");
                    System.out.print("Password: ");
                    password = scanner.nextLine();
                    logged = registers.login(username, password);
                    break;
                case 2:
                    System.out.print("Username: ");
                    username = scanner.nextLine();
                    System.out.println(" ");
                    System.out.print("Password: ");
                    password = scanner.nextLine();
                    registers.register(username, password);
                    break;
                case 3:
                    rooms.displayRooms();
                    break;
                case 4:
                    if (logged) {
                        System.out.print("Enter room number to book: ");
                        int roomNumber = scanner.nextInt();
                        rooms.bookRoom(roomNumber);
                    } else {
                        System.out.println("You must be logged in to book a room.");
                    }
            }
        }
    }
}