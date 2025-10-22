import java.util.Scanner;

public class Log {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);
        final String VALID_USERNAME = "Gian";
        final String VALID_PASSWORD = "Gian123!";
        boolean loggedIn=false;
        String currentUser =" ";

        while (true) {
            if (!loggedIn) {
                System.out.println("---MENU---");
                System.out.println("1.Login");
                System.out.println("2.Exit");
                System.out.println("Choose an option");
                String choice = scanner.nextLine().trim();

                if (choice.equals("1")) {
                    System.out.print("Username: ");
                    String username = scanner.nextLine();

                    System.out.print("Password: ");
                    String password = scanner.nextLine();

                    if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
                        loggedIn=true;
                        currentUser=username;
                        System.out.println("Login Successfull, Welcome"+ currentUser + "!");
                    } else{
                        System.out.println("Invalid username or password. Please Try Again man");
                    }
                } else {
                    System.out.println("USER MENU");
                    System.out.println("Logged in as: " + currentUser);
                    System.out.println("1.Logout");
                    System.out.println("2.Exit");
                    System.out.println("Choose an option");
                    String choice2 = scanner.nextLine().trim();

                    if (choice2.equals("1")) {
                        loggedIn = false;
                        System.out.println("You have been logged out!");
                        currentUser = "";
                    } else if (choice2.equals("2")) {
                        System.out.println("Invalid optionj. Please either 1 or 2");
                    }
                }
            }
            scanner.close();
        }
    }
}