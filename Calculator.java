public class Calculator {

    public void addNumbers() {
        int num1 = 10; 
        int num2 = 20;  
        int sum = num1 + num2;

        System.out.println("The sum is" + sum);
    }

 
    public static void main(String[] args) {
       
        Calculator calc = new Calculator();

  
        calc.addNumbers();
    }
}
