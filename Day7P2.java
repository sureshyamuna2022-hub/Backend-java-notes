public class Day7P2 {
 
    public static void main(String[] args) {
        // try {
        //     int a = 10;
        //     int b = 2;
        //     int answer = a / b;
        //     System.out.println(answer);
        // } catch (ArithmeticException e) {
        //     System.out.println("Can not Divide by Zero");
        // } finally {
        //     System.out.println("Program Completed");
        // }
 
        // int[] marks = {80, 90, 100, 100, 100};
        // try {
        //     System.out.println(marks[0]);
        //     System.out.println(marks[1]);
        //     System.out.println(marks[2]);
        //     System.out.println(marks[3]);
        //     System.out.println(marks[4]);
        //     System.out.println(marks[10]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Invalid Array Index");
        // }
        // try {
        //     String name = null;
        //     System.out.println(name.length());
        //     // System.out.println(name.toUpperCase());
        // } catch (NullPointerException e) {
        //     System.out.println("String is NULL Value");
        // }
        // try {
        //     String check = "ABC";
        //     int number = Integer.parseInt(check);
        //     System.out.println(number);
        // } catch (NumberFormatException e) {
        //     System.out.println("Invalid Number");
        // }
 
        try{
            String name="Java";
            System.out.println(name.charAt(10));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Invalid String Index");
        }
    }
}