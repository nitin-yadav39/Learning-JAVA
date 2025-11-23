// import java.util.Scanner;

// public class FactorialFor {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number ");
//         int num = scanner.nextInt();

//         int facto = 1;

//         for (int i = 1; i <= num; i++) {
//             facto *= i;
//         }

//         System.out.println("Factorial of " + num + " is " + facto);

//         scanner.close();
//     }
// }

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number ");
        int num = scanner.nextInt();

        int facto = 1;
        int i = 1;

        while (i <= num) {
            facto *= i;
            i++;
        }

        System.out.println("Factorial of " + num + " is " + facto);

        scanner.close();
    }
}
