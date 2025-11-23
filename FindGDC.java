import java.util .Scanner;

public class FindGDC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pehla number:");
        int num1 = scanner .nextInt();

        System.out.print("Doosra number:");
        int num2 = scanner .nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println(num1 + " aur " + num2 + " ka GDC/HCF hai: " + gcd);

    
    }

    // Euclidean algorithm se GCD find karne wala method
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}