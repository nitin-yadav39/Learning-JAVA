public class AddBinaryStrings {
    public static void main(String[] args) {
        String binary1 = "1010";  // first binary number
        String binary2 = "1101";  // second binary number

        // Binary strings ko integer (base 2) mein convert karte hai
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        int sum = num1 + num2;  // Integer addition

        // Result ko wapas binary string me convert karte hain
        String binarySum = Integer.toBinaryString(sum);

        System.out.println("Binary Sum: " + binarySum);
    }
}
