class Complex {
    int real;
    int imag;

    // Constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // Method to print complex number
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class AddComplexNumbers {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);   // Pehla complex number: 3 + 2i
        Complex c2 = new Complex(1, 7);   // Doosra complex number: 1 + 7i

        Complex sum = c1.add(c2);         // Addition

        System.out.print("Sum = ");
        sum.display();                    // Output: 4 + 9i
    }
}
