import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1; 

        while (i <= n) {
            sum += i;
            i += 2;
        }

        System.out.println("Sum of odd no. from 1 to " + n + " is " + sum);

        scanner.close();
    }
}
