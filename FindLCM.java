import java.util.Scanner;

public class FindLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pehla number daaliye: ");
        int num1 = scanner.nextInt();

        System.out.print("Doosra number daaliye: ");
        int num2 = scanner.nextInt();

        int lcm = (num1 > num2) ? num1 : num2;  // LCM start kare bada number se

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;  // jab lcm dono numbers se divisible ho, loop rok do
            }
            lcm++;  // nahi to lcm ko 1 se badhao
        }

        System.out.println(num1 + " aur " + num2 + " ka LCM hai: " + lcm);
    }
}
