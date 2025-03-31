import java.util.Scanner;

// Base User class
class User {
    protected String username;
    protected String password;

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Method to validate login credentials
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

// Admin class extending User
class Admin extends User {
    // Constructor
    public Admin(String username, String password) {
        super(username, password);
    }

    // Admin-specific method
    public void manageUsers() {
        System.out.println("Admin can manage users.");
    }
}

// Main class to test functionality
public class UserAuthentication{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a regular user and an admin
        User user = new User("user123", "pass123");
        Admin admin = new Admin("admin", "adminpass");

        // Taking login input
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Checking login credentials
        if (user.login(inputUsername, inputPassword)) {
            System.out.println("Login successful! Welcome, User.");
        } else if (admin.login(inputUsername, inputPassword)) {
            System.out.println("Login successful! Welcome, Admin.");
            admin.manageUsers();
        } else {
            System.out.println("Invalid credentials! Try again.");
        }

        scanner.close();
    }
}
