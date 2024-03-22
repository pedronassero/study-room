import java.util.HashMap;

public class Users {
    private HashMap<String, String> users;

    public Users() {
        users = new HashMap<>();
    }

    public void register(String username, String password) {
        if (checkUserExistence(username)) {
            System.out.println("User already exists.");
        } else {
            users.put(username, password);
            System.out.println("User successfully registered.");
        }
    }

    public boolean checkUserExistence(String username) {
        return users.containsKey(username);
    }

    public boolean login(String username, String password) {
        if (checkUserExistence(username) && users.get(username).equals(password)) {
            System.out.println("You have successfully logged in.");
            return true;
        } else {
            System.out.println("Wrong username or password");
            return false;
        }
    }
}
