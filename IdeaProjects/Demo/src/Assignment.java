import java.util.Scanner;

public class Assignment {
    // 1. declare 2 int variables miles and yards and one double variable for kilometers
    // 2. Initialise the variables to hold the numbers of miles n yards in marathon respectively.(miles 26 and yard to 385)
    // 3. write an expression to calculate kilometers from miles and yards.
    // 4. save thr result of exp in variable kilpometer s .
    // one mile is 1.609 kms. there are 1760 yards in a mile.

public static boolean evenodd(int n){
    if(n%2==0)
        return true;
    else
        return false;

}
// switch case restuarant code.
    public static void display(){
        System.out.println("Sr.No  Menu   Quantity   Rate/Price");
        System.out.println("1.    Idli      1     35");
    }
    public static void display1(){
        System.out.println("Sr.No  Menu   Quantity   Rate/Price");
        System.out.println("2.    Tea        1      35");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int miles = 26, yards = 385;
        double km1 = 0.0f, km2= 0.0f;
        km1 = miles*1.609f;
        System.out.println(km1);

        double yardtomile = yards/1760f;
        km2 = yardtomile*1.609f;
        System.out.println(km2);

        //create a class called evenoddnumber.
        // It has a method called evenor odd (int i) to find weather the numner is even or odd.
        // this method takes a integer and returns boolean value.
        // create other class demo with the main method and craete an object from evenoddnumber class.
        int x = sc.nextInt();
        System.out.println( evenodd(x));



    }
}
