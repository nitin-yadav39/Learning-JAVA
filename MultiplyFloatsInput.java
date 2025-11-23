import java.util.Scanner;

public class MultiplyFloatsInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner banaya input lene ke liye

        System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();   // Pehla number input liya

        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();   // Doosra number input liya

        float result = num1 * num2;   // Dono ko multiply kiya

        System.out.println("The result is: " + result);  // Result print kiya
    }
}
