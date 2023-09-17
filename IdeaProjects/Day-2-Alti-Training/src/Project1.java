import java.util.Scanner;

public class Project1 {
//    Emp No.  Emp Name Join Date  Design  Code  Dept	Basic	HRA	IT
//     1001	   Ashish	01/04/2009	e	 R&D	20000	8000	3000
// Salary  = Basic+HRA+DA-IT
    public static void one(){
        System.out.println("Emp No. \tEmp Name \tDepartment \t Designation \t Salary");
        System.out.println("1001  \t   Ashish \t R&D \t    Engineer \t   45000");
    }
    public static void two(){
        System.out.println("Emp No.\tEmp Name\t  Department \t Designation \t Salary \n");
        System.out.println("1002\t  Sushma \t PM\t consultant\t 65000");
    }
    public static void three(){
        System.out.println("Emp No.\tEmp Name\t  Department \t Designation \t Salary \n");
        System.out.println("1003\t  Rahul \t Clerk  \t  Acct \t   \t   29000\n");
    }
    public static void four(){
        System.out.println("Emp No.\tEmp Name\t  Department \t Designation \t Salary \n");
        System.out.println("1004\t Chahat\t Front Desk\t Receptionist\t 31000\n");
    }
    public static void five(){
        System.out.println("Emp No.\tEmp Name\t  Department \t Designation \t Salary \n");
        System.out.println("1005\t Ranjan \tEngg\t Manager\t 90000 \n");
    }
    public static void six(){
        System.out.println("Emp No.\tEmp Name\t  Department \t Designation \t Salary \n");
        System.out.println("1006\t   Suman\t Engineer\t  Manufacturing\t 47600\n");
    }
    public static void seven(){
        System.out.println("Emp No.\tEmp Name\t  Department \t Designation \t Salary \n");
        System.out.println("1007\t  Tanmay\tPM\t consultant\t 63000\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int emp_id = sc.nextInt();
        if(emp_id>1007 || emp_id<1001){
            System.out.println("There is no employee with empid :"+emp_id);
        }

//        do {
//
//
//        } while (emp_id>1007 || emp_id<1001);

        switch(emp_id){
            case 1001: one();
            break;
            case 1002: two();
                break;
            case 1003: three();
                break;
            case 1004: four();
                break;
            case 1005: five();
                break;
            case 1006: six();
                break;
            case 1007: seven();
                break;
            default:
                System.out.println("There is no employee with empid :"+emp_id);

        }
    }
}
