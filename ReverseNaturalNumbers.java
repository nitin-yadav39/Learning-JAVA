import java.util.Scanner;

public class ReverseNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a natural number ");
        int n = scanner.nextInt();

        
        while (n >= 1) {
            System.out.println(n);
            n--;
        }

        scanner.close();
    }
}
