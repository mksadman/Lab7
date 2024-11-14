import java.util.HashMap;
import java.util.Map;
import java.io.*;

public class UserManager {
    private static UserManager instance;
    private Map<String, User> users;

    private UserManager() {
        users = new HashMap<>();
        loadUsersFromFile();
    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public User authenticate(String username, String password) {
        User user = users.get(username);
        if (user != null && user.authenticate(password)) {
            System.out.println("User approved as: " + user.getClass().getSimpleName());
            return user;
        }

        System.out.println("Authentication failed");
        return null;
    }

    public void loadUsersFromFile(){

    }

    public void saveUsersToFile(){

    }
}
