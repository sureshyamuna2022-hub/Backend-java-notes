class Day1 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String Name = "Yashna";
        System.out.println("Hi " + Name);
        int age = 19;
        System.out.println("I am " + age + " years old.");
        float Balance = 1000.50f;
        System.out.println("My account balance is: $" + Balance);

        int myAge = 19;
        System.out.println(myAge);
        int MyAge = 19;
        System.out.println(MyAge);
        int my_age = 19;
        System.out.println(my_age);

        // dont use the wight space and operators(+,_,*,/)  in the variable name //
        // dony use the reserved keywords in the variable names //
        // dont use the special characrters in the variables //
        // dont use the starting  numbers in the variable names //

        int myage = 19;
        System.out.println(my age);
        int $myage =19;
        System.out.println($myage);
        boolean check = false;
        System.out.println(check);
        char check = 'A';
        System.out.println(check);
        byte p=127;
        System.out.println(p);
       

        //Arithmetic Operators
        int a=30;
        int b=20;
        System.out.println("Addition "+(a+b));
        System.out.println("Subtraction "+(a-b));
        System.out.println("Multiplication "+(a*b));
        System.out.println("Division "+(a/b));
        System.out.println("Modulus "+(a%b));

        //Assignment Operators
        a+=b;
        System.out.println("Addition Assignment "+a);
        a-=b;
        System.out.println("Subtraction Assignment "+a);
        a*=b;
        System.out.println("Multiplication Assignment "+a);
        a/=b;
        System.out.println("Division Assignment "+a);
        a%=b;
        System.out.println("Modulus Assignment "+a);

        //Comparison Operators
        System.out.println("Equal to:"+(a==b));
        System.out.println("Not equal to:"+(a!=b));
        System.out.println("Greater than:"+(a>b));
        System.out.println("Less than:"+(a<b));
        System.out.println("Greater than or equal to:"+(a>=b));
        System.out.println("Less than or equal to:"+(a<=b));

        //Logical Operators
        System.out.println("Logical AND:"+(a>b && a<b)); 
        System.out.println("Logical OR:"+(a>b || a<b)); 
        System.out.println("Logical NOT:"+(!(a>b)));

        //Increment and Decrement Operators
        int x=10;
        int y=15;
        y=++x;
        System.out.println("Pre-Increment:"+x+","+y);
        y=--x;
        System.out.println("Pre-Decrement:"+x+","+y);
        y=x++;
        System.out.println("Post-Increment:"+x+","+y);
        y=x--;
        System.out.println("Post-Decrement:"+x+","+y);








    

    }
}
