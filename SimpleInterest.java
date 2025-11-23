
public class SimpleInterest {

    public void calculateInterest() {
        double P = 1000; 
        double T = 2;    
        double R = 5;    

        double SI = (P * T * R) / 100; 

        System.out.println("Simple Interest is: " + SI);
    }


    public static void main(String[] args) {
        
        SimpleInterest si = new SimpleInterest();

        
        si.calculateInterest();
    }
}
