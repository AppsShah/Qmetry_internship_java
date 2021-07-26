package assignment_1;

import java.util.Scanner;

public class Deposit {
    Balance m=new Balance();
    float bal=m.getbalance();
    public void deposit(){
       try {
        Scanner sc=new Scanner(System.in);
        float userdata;
        System.out.println("enter Amount to Deposit:");
        userdata=Float.parseFloat(sc.next());
        bal=bal+userdata;
        m.setbalance(bal);
        m.setbalance(1);
        System.out.println("your Money is Deposited!");
       } catch (NumberFormatException e) {
           System.out.println("wrong input ! in do not enter any Alphabet or synbol");
       }
    }
}
