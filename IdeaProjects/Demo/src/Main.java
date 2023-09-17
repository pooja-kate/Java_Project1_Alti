import java.util.Scanner;
//        1) Java introduction (Done)
//        2) Primitive Types (Done)
//        3) Operators (Done)
//        4) Program control – if,for,while etc
//        5) OOP basics
// Assignment questions...

//  Coding Q.
//write a java program to take students Fname, STUId, and location he or she using command line arguments.
//display user inputs
// exersice -3.
// create a class called evenoddnumber.
// It has a method called evenor odd (int i) to find weather the numner is even or odd.
// this method takes a integer and returns boolean value.
// create other class demo with the main method and craete an object from evenoddnumber class.
//
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void area_rect(double x, double y){
        double area = x*y;
        System.out.println(area);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
        double a =20;
        double b = 20;
        int c = 4; // inverse operator 0 -1 -2 -3 -4 -5
        System.out.println(~c);
        // operators
        // << left shift 3<<2 = 3*2^2 = 12
        // >> right shift 3/2^2 = 3/4
        // >>> unsigned right shift  14>>>2
        area_rect(a,b);
for(int i=0; i<5; i++){
    for(int j=0; j<i; j++){
        System.out.print(" * ");
    }
    System.out.println();
}
    }
}