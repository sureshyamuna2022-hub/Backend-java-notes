class Task2 {
    public static void main(String args[]) {
        // Print numbers from 1 to 100 using a for loop

        // for (int i = 1; i <= 100; i++) {
        //     System.out.println(i);
        // }

        // 2. Print numbers from 100 to 1 using a while loop

        //  int i = 100;

        // while (i >= 1) {
        //     System.out.println(i);
        //     i--;
        // }

        // 3. Print all even numbers between 1 and 100

        //  for (int i = 1; i <= 100; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(i);
        //     }
        // }

        // 4. Print all odd numbers between 1 and 100

        // for (int i = 1; i <= 100; i++) {
        //     if (i % 2 != 0) {
        //         System.out.println(i);
        //     }
        // }
    
        //5. Find the sum of the first N natural numbers

        // int n = 10;
        // int sum = 0;

        // for (int i = 1; i <= n; i++) {
        //     sum = sum + i;
        // }

        // System.out.println("Sum = " + sum);

        //6. Factorial of a given number using a loop

        // int n = 5;
        // int fact = 1;

        // for (int i = 1; i <= n; i++) {
        //     fact = fact * i;
        // }

        // System.out.println("Factorial = " + fact);

        //7. Reverse a given number using a loop

        //  int num = 12345;
        // int rev = 0;

        // while (num > 0) {
        //     int digit = num % 10;
        //     rev = rev * 10 + digit;
        //     num = num / 10;
        // }

        // System.out.println("Reverse = " + rev);

        //8. Check whether a number is a palindrome
        // int num = 121;
        // int original = num;
        // int rev = 0;

        // while (num > 0) {
        //     int digit = num % 10;
        //     rev = rev * 10 + digit;
        //     num = num / 10;
        // }

        // if (original == rev) {
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("Not Palindrome");
        // }

        //9. Count the number of digits in a given integer

        //   int num = 12345;
        // int count = 0;

        // while (num > 0) {
        //     num = num / 10;
        //     count++;
        // }

        // System.out.println("Number of digits = " + count);

        //10. Find the sum of the digits of a given number

        // int num = 12345;
        // int sum = 0;

        // while (num > 0) {
        //     int digit = num % 10;
        //     sum = sum + digit;
        //     num = num / 10;
        // }

        // System.out.println("Sum of digits = " + sum);

        //Multiplication table of a given number

        //   int num = 5;

        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(num + " x " + i + " = " + (num * i));
        // }

        //12. Fibonacci series up to N terms


        // int n = 10;
        // int a = 0, b = 1;

        // for (int i = 1; i <= n; i++) {
        //     System.out.print(a + " ");

        //     int c = a + b;
        //     a = b;
        //     b = c;
        // }

        //13. Check whether a number is prime

        // int num = 7;
        // int count = 0;

        // for (int i = 1; i <= num; i++) {
        //     if (num % i == 0) {
        //         count++;
        //     }
        // }

        // if (count == 2) {
        //     System.out.println("Prime Number");
        // } else {
        //     System.out.println("Not a Prime Number");
        // }

        //14. Print all prime numbers between 1 and 100

        for (int num = 2; num <= 100; num++) {
            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(num + " ");
            }
        }








        






    }
}
