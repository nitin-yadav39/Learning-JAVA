import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 2;

        while (i <= n) {
            sum += i;
            i += 2;
        }

        System.out.println("Sum of even no. from 1 to " + n + " is " + sum);

        scanner.close();
    }
}
