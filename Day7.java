public class Day7 {
 
    // static void display() {
    //     System.out.println("Welcome to Credo Systemz");
    // }
    // static void checkAge(int age) {
    //     if (age >= 18) {
    //         System.out.println("VE");
    //     } else {
    //         System.out.println("NVE");
    //     }
    // }
    // static void display(String fname, String lname, int pin) {
    //     System.out.println("Welcome " + fname + " " + lname);
    //     System.out.println("Pin : " + pin);
    // }
    // with arg, with return type
    // static int add(int a, int b, int c, int d, int e) {
    //     return a + b + c + d + e;
    // }
    // without arg, with return type
    // static int add() {
    //     int a = 10;
    //     int b = 100;
    //     return a + b;
    // }
    // with arg, without return type
    // static void add(int a, int b, int c) {
    //     System.out.println(a + b + c);
    // }
    // without arg, without return type
    // static void add() {
    //     int a = 10;
    //     int b = 2;
    //     System.out.println(a + b);
    // }
    // static int intadd(int a, int b, int c) {
    //     return a + b + c;
    // }
    // static double doubleadd(double a, double b, double c) {
    //     return a + b + c;
    // }
    static int add(int a, int b) {
        return a + b;
    }
 
    static double add(double a, double b) {
        return a + b;
    }
 
    static String add(String a, String b) {
        return a + b;
    }
 
    public static void main(String args[]) {
 
        System.out.println(add(10, 20));
        System.out.println(add(10.2, 20.2));
        System.out.println(add("Sridhar", " Raj P"));
        // System.out.println(intadd(10,20,30));
        // System.out.println(doubleadd(10.4, 20.2, 30.1));
 
        // display();
        // add();
        // add(90, 100, 100);
        // System.out.println(add());
        // System.out.println(add(90, 80, 100, 100, 100));
        // display("Sridhar", "Raj", 2026);
        // display("Sasi", "Balan", 2000);
        // checkAge(12);
    }
 
}