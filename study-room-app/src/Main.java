import java.util.Scanner;
import jdk.jshell.SourceCodeAnalysis;

public class Main {
    public static void main(String[] args) {
        Users registers = new Users();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice <  1 ||choice > 3) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("1 - Login");
            System.out.println("2 - Register");
            System.out.println("3 - Store");
            choice = scanner.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("Option not found.");
            }
        }
    }
}