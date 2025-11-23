public class SwapWithTemp {
    public static void main(String[] args) {
        int a = 5;  // pehla number
        int b = 10; // doosra number

        System.out.println("Swap se pehle: a = " + a + ", b = " + b);

        int temp = a; // temp mein a ki value store ki
        a = b;        // ab a mein b ki value daali
        b = temp;     // b mein purani a ki value daali

        System.out.println("Swap ke baad: a = " + a + ", b = " + b);
    }
}
