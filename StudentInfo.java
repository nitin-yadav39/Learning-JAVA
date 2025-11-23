

public class StudentInfo {

   
    public void displayInfo() {
        String name = "Aman Sharma";
        int age = 16;
        String grade = "10th";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    
    public static void main(String[] args) {
       
        StudentInfo student = new StudentInfo();

        student.displayInfo();
    }
}
