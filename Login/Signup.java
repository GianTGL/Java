// Testing 
// Still learning on how to put it into a txt file and how it can detect it.

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------------");
        System.out.println("Gian's THING");
        System.out.println("----------------");

        String name = "Gian";
        String pass = "Gianszou123";
        

        String NewSignins[] = new String[100];
        String NewSigninsPass[] = new String[100];
        int newUsers = 0;

        System.out.println("1. Login ");        
        System.out.println("2. Signup ");
        System.out.println("CHOOSE OPTION 1 OR 2");
        int chosen = input.nextInt();
        input.nextLine();


    if (chosen == 1) { 
        System.out.print("Username : ");
        String username = input.nextLine();

        System.out.print("Password : ");
        String password = input.nextLine();

        if (username.equals(name) && password.equals(pass) || (username.equals(NewSignins) && password.equals(NewSigninsPass))) {
            System.out.print("Hello, Gian");
        } else {
            System.out.println("Wrong username or password. OR THE ACCOUNT DOES NOT EXIST");
        }
    } else if (chosen == 2) {
        System.out.println("----------------------------");
        System.out.println("SIGN UP");
        System.out.println("----------------------------");
        System.out.print("Username : ");
        NewSignins[newUsers] = input.nextLine();

        System.out.print("Password : ");
        NewSigninsPass[newUsers] = input.nextLine();

        newUsers++;
    
    }
        input.close();
    }
}
