import java.util.*;
public class TempratureCheck {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temprature in celsius");
        int temprature = sc.nextInt();
        if(temprature > 0){
            System.out.println("YES, Suitable for outdoor");
        }
        else if(temprature < 0) {
            System.out.println("Too Cold, Not Suitable for outdoor");
        } 
        else{
            System.out.println("Temprature is Zero, Normal for Outdoor activities");
        }
        
    }
    
}