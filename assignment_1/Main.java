package assignment_1;
import java.util.Scanner;
public class Main{
    Balance b=new Balance();
    Withdraw w=new Withdraw();
    Deposit d=new Deposit();
    boolean exit;
    public static void main(String[] args) {
        Main m=new Main();
        m.runmenu();
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
                // System.out.println("withdraw");
                w.withdraw();
            break;
            case 2:
                d.deposit();
                // System.out.println("deposit");
            break;
            case 3:
               b.balance();
            break;
            case 4:
            System.out.println("Thankyou for using Services !");
            exit=true;
            break;
            default:
            System.out.println("Wrong input in number");
        }
    }
    private int getinput(){
        int choice=0;
        Scanner s=new Scanner(System.in);
        try {
            System.out.println("Enter your Choice :");
            choice=Integer.parseInt(s.next());
        } catch (NumberFormatException e) {
            System.out.println("wrong input ! in do not enter any Alphabet or synbol");
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