public class TestFile {
    public static void main (String[] args) {
        String str1 = "string Examples";
        int length = str1.length();
        char ch = str1.charAt(5);
        int indf = str1.indexOf("s");
        int indfl = str1.lastIndexOf("s");         
        String str2 = str1.toUpperCase();          
        String str3 = str1.toLowerCase();         
        String str4 = str1.replace("g", "h");      

        System.out.println("Total length of String str1 = " + length);
        System.out.println("Character at index 5 in str1 = " + ch);
        System.out.println("First index of 's' from str1 = " + indf);
        System.out.println("Last index of 's' from str1 = " + indfl);
        System.out.println("Uppercase of str1 = " + str2);
        System.out.println("Lowercase of str1 = " + str3);
        System.out.println("Replacing 'g' with 'h' in str1 = " + str4);

    }
}