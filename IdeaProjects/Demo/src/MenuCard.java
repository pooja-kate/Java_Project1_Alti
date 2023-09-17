import java.util.Scanner;
public class MenuCard {
    public static void snack(){
        System.out.println(" \t Sr.no \t snack item  \t qty  \t rate ");
        System.out.println(" \t 1  \t idli   \t 1  \t 30");
    }
    public static void lunch(){
        System.out.println(" \t Sr.no \t snack item  \t qty  \t rate ");
        System.out.println(" \t 1  \t rice   \t 1  \t 30");
    }
    public static void Dinner(){
        System.out.println(" \t Sr.no \t snack item  \t qty  \t rate ");
        System.out.println(" \t 1  \t chapati  \t 1  \t 30");
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        MenuCard obj = new MenuCard();
        do{
            System.out.println("Enter Choice:");


            System.out.println("Menu");
            System.out.println("1 Snack");
            System.out.println("2 Lunch");
            System.out.println("3 Dinner ");
            System.out.println("4 Exit");
        }

        while(ch==4);
        switch (ch)
        {
            case 1: obj.snack();
            break;
            case 2: obj.lunch();
            break;
            case 3: obj.Dinner();
            break;
            default:

        }

    }
}