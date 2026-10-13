public class Day2 {
  public static void main(String args[]) {
    // Add 5 numbers and find Sum and Average
    // int T = 80, E = 85, M = 90, S = 100, SS = 95;
    // int sum=T+E+M+S+SS;
    // System.out.println(sum);
    // double average=sum/5;
    // System.out.println(average);

    // Swap 2 Numbers - a=10, b=20 => Output : a20,b=10
    // int a = 10, b = 20;
    // int c;
    // System.out.println("Before Swapping");
    // System.out.println("A = " + a);
    // System.out.println("B = " + b);
    // a=a+b;
    // //10+20 a=30
    // b=a-b;
    // //30-20 b=10
    // a=a-b;
    // //30-10 a=20
    // c=a;
    // // a=10,c=10
    // a=b;
    // // b=20,a=20
    // b=c;
    // // c=10,b=10
    // System.out.println("After Swapping");
    // System.out.println("A = " + a);
    // System.out.println("B = " + b);

    // Fahrenheit to Celsius Conversion //

    // double Fahrenheit = 102;
    // double Celsius = (Fahrenheit - 32) * 5/9;
    // System.out .println("Celsius = " + Celsius);

    // Celsius to Fahrenheit Conversion //

    // double Celsius = 25;
    // double Fahrenheit = (Celsius * 9/5) +32;
    // System.out.println ("Fahrenheit = " + Fahrenheit);

    // Kilometer to Miles conversion //
    // double Kilometer = 50;
    // double Miles = Kilometer * 0.621371;
    // System.out.println("Miles = " + Miles);

    // Miles to kilometer Conversion //
    // double Miles = 50;
    // double Kilometer = Miles * 1.60934;
    // System.out.println("kilometer = " + Kilometer);

    // Speed Calculator //
    // double Distance =150;
    // double Time =3;
    // double Speed = Distance / Time;
    // System.out.println("Speed = " + Speed + " km/hr");

    // Time Calculator //
    // double Distance = 200;
    // double Speed = 50;
    // Double Time = Distance / Speed;
    // System.out.println("Time = " + Time + " hr ");

    // Distance Calculator //
    // double Speed =60;
    // double Time =2;
    // double Distance = Speed * Time;
    // System.out.println("Distance = " + Distance + " km");

    // Salary Calculator //
    // double YearlySalary =480000;
    // System.out.println("Monthly Salary :" + YearlySalary / 12);
    // System.out.println("Weekly Salary :" + YearlySalary / 52);
    // System.out.println("Daily Salary : " + YearlySalary / 365);
    // System.out.println("Hourly Salary : " + YearlySalary / 365 / 8);

    // Simple interest Calculator //
    // double Principal = 200000;
    // double Rate = 5;
    // double Time = 2;

    // double SimpleInterest = (Principal * Rate * Time) / 100;

    // System.out.println("Principal Amount : " + Principal);
    // System.out.println("Rate of Interest : " + Rate + "%");
    // System.out.println("Time (Years) : " + Time);
    // System.out.println("Simple Interest : " + SimpleInterest);

    // Area of square shape //

    // double Side = 8;

    // double Area = Side * Side;

    // System.out.println("Side of Square : " + Side);
    // System.out.println("Area of Square : " + Area);

    // double Length = 10;
    // double Width = 5;

    // double Area = Length * Width;

    // System.out.println("Length : " + Length);
    // System.out.println("Width : " + Width);
    // System.out.println("Area : " + Area);

    // Area of Rectangle //

    // double Length = 10;
    // double Width = 5;

    // double Area = Length * Width;

    // System.out.println("Length : " + Length);
    // System.out.println("Width : " + Width);
    // System.out.println("Area : " + Area);

    // Area of Triangle //

    // double Base = 10;
    // double Height = 8;

    // double Area = 0.5 * Base * Height;

    // System.out.println("Base : " + Base);
    // System.out.println("Height : " + Height);
    // System.out.println("Area : " + Area);

    // Area of Circle //

    // double Radius = 7;

    // double Area = 3.14 * Radius * Radius;

    // System.out.println("Radius : " + Radius);
    // System.out.println("Area : " + Area);

    //                                         2-Unit:--> Control Statements ///

    // 1 --> if Statement

    // int mark=20;
    // if(mark>=35){
    // System.out.println("Student Pass");
    // }
    // if(mark<35){
    // System.out.println("Student Fail");
    // }

    // 2--> if.....Else
    // Eligible or Not Eligible for vote
    // int age=16;
    // if(age>=18){
    // System.out.println("VE");
    // }
    // else{
    // System.out.println("NVE");
    // }
    // Student Pass or Fail
    // int mark=15;
    // if(mark>=35){
    // System.out.println("Student pass");
    // }
    // else{
    // System.out.println("Student Fail");
    // }
    // Odd Or Even

    // int num=13;
    // if(num%2==0){
    // System.out.println("Even Number");
    // }
    // else{
    // System.out.println("Odd Number");
    // }

    // Largest Two numbers

    // int a = 25;
    // int b = 15;

    // if (a > b) {
    // System.out.println("A is the Largest Number");
    // }
    // else {
    // System.out.println("B is the Largest Number");
    // }

    // int a = 10;
    // int b = 30;

    // if (a > b) {
    // System.out.println("A is the Largest Number");
    // }
    // else {
    // System.out.println("B is the Largest Number");
    // }

    // Leap Year Not a Leap Year

    // int year = 2026;

    // if (year % 4 == 0) {
    // System.out.println("Leap Year");
    // }
    // else {
    // System.out.println("Not a Leap Year");
    // }

    // vowel checking

    // char ch = 'b';

    // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    // System.out.println("Vowel");
    // }
    // else {
    // System.out.println("Not a Vowel");
    // }

    // 3--> Ladder if....else Statement
    // int a=100;
    // int b=100;
    // int c=100;
    // if(a>b && a>c){
    // System.out.println("A is Biggest Value");
    // }
    // else if(b>a && b>c){
    // System.out.println("B is Biggest Value ");
    // }
    // else if(c>a && c>b){
    // System.out.println("C is Biggest value");
    // }
    // else{
    // System.out.println("A,B,C = Same Value");
    // }

    // int num= -0;
    // if(num>0){
    // System.out.println("+ Value");
    // }
    // else if(num<0){
    // System.out.println("- value");
    // }
    // else {
    // System.out.println("Zero");

    // }

    // int a = 25;
    // int b = 40;
    // int c = 15;
    // int d = 30;

    // if (a > b && a > c && a > d) {
    // System.out.println("A is Largest");
    // } else if (b > a && b > c && b > d) {
    // System.out.println("B is Largest");
    // } else if (c > a && c > b && c > d) {
    // System.out.println("C is Largest");
    // } else {
    // System.out.println("D is Largest");
    // }

    // 4--> Nested if....else
    // int a=50;
    // int b=100;
    // int c=15;

    // if(a>b){
    // if(a > c){
    // System.out.println("A is Biggest Value");
    // }
    // else{
    // System.out.println("C is Biggest Value");
    // }
    // }
    // else{
    // if(b > c){
    // System.out.println("B is Biggest Value");
    // }
    // else{
    // System.out.println("C is Biggest Value");
    // }
    // }

    // int age=20;
    // String nationality="USA";
    // if(age>=18){
    // if(nationality =="Indian"){
    // System.out.println("Eligible to vote");
    // }
    // else{
    // System.out.println("Note Eligible to vote");
    // }

    // }
    // else{
    // System.err.println("Not Eligible to Vote");
    // }

    // 5--> Ternary operator (? :)
    // int mark=30;
    // String check=(mark>=35)? "Pass" : "Fail";
    // System.out.println(check);

    // int a=50;
    // int b=10;
    // String check=(a>b) ? "A is Biggest Value" : "B is Biggest Value";
    // System.out.println(check);
    int num1 = 10;
    int num2 = 2;
    String opr = "+";

    switch (opr) {

      case "+":
        System.out.println(num1 + num2);
        break;

      case "-":
        System.out.println(num1 - num2);
        break;

      case "*":
        System.out.println(num1 * num2);
        break;

      case "/":
        System.out.println(num1 / num2);
        break;

      default:
        System.out.println("Please Enter +, -, *, /");
        break;
    }

  }
}