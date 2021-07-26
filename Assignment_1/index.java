package Assignment_1;
import java.util.Scanner;

public class index{
    private int balance=1000;
    boolean exit;
    public static void main(String[] args) {
        index i=new index();
        i.runmenu();
    }
    public void runmenu(){
        printmenu();
        while(!exit){
            printoption();
            int choice=getinput();
            action(choice);
        }
    }
    private void action(int choice){
        switch(choice){
            case 1:
                withdraw();
            break;
            case 2:
                deposit();
            break;
            case 3:
                balance();
            break;
            case 4:
            System.out.println("Thankyou for using Services !");
            exit=true;
            break;
            default:
            System.out.println("Wrong input in number");
        }
    }
    private void balance(){
        System.out.println("your Balance is :"+balance);
    }
    private void deposit(){
        Scanner sc=new Scanner(System.in);
        int userdata;
        System.out.println("enter Amount to Deposit:");
        userdata=Integer.parseInt(sc.next());
        balance=balance+userdata;
        System.out.println("your Money is Deposited!");
    }
    private void withdraw(){
        Scanner sc=new Scanner(System.in);
        int userdata;
        System.out.println("enter Amount to withdraw:");
        userdata=Integer.parseInt(sc.next());
        if(userdata>=balance)
        {
            System.out.println("Your Balance is Low");
        }
        else
        {
            balance=balance-userdata;
            System.out.println("withdrawal Successfull!");
        }
    }
    private int getinput(){
        int choice=0;
        Scanner s=new Scanner(System.in);
        try {
            System.out.println("Enter your Choice :");
            choice=Integer.parseInt(s.next());
        } catch (NumberFormatException e) {
            //TODO: handle exception
            System.out.println("you have choose wrong input or use Alphabet");
        }
        return choice;
    }
    private void printmenu(){
        System.out.println("+----------------------------------------------------+");
        System.out.println("|            WELCOME TO BANKING SYSTEM               |");
        System.out.println("+----------------------------------------------------+");
    }
    private void printoption(){
        System.out.println("");
        System.out.println("Please select your option:");
        System.out.println("");
        System.out.println("1:Withdraw");
        System.out.println("2:Deposit");
        System.out.println("3:Check Balance");
        System.out.println("4:Exit");
    }
}