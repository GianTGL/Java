import java.util.Scanner;

public class Calculator {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Number1: ");
        double num1 = scan.nextDouble();

        System.out.println("Number2: ");
        double num2 = scan.nextDouble();     

        System.out.println("Stuff: ");
        String stuff = scan.next().trim();

        if (stuff.equals("+")) {
            System.out.println(num1 + num2);
        } else if (stuff.equals("-")) {
            System.out.println(num1 - num2);
        } else if (stuff.equals("*")) {
            System.out.println(num1 * num2);
        } else if (stuff.equals("/")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid operation");
        }

    }
}
