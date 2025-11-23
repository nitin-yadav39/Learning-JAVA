import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Input ke liye Scanner

        System.out.print("Koi bhi integer number daaliye: ");
        int number = scanner.nextInt();  // User se number input liya

        if (number % 2 == 0) {
            System.out.println(number + " ek Even  number hai.");
        } else {
            System.out.println(number + " ek Odd  number hai.");
        }
    }
}
