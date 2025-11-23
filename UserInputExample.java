import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a string

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble(); // Read a decimal number

        System.out.println("\nHello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + height + " meters.");
    }
}
