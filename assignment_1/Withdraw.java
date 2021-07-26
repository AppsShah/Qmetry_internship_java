package assignment_1;

import java.util.Scanner;

public class Withdraw {
    Balance m=new Balance();
    public void withdraw(){
        Scanner sc=new Scanner(System.in);
        float userdata;
        float wbalance=m.getbalance();
        System.out.print("get balance"+wbalance);
        System.out.println("enter Amount to withdraw:");
            try {
                userdata=Float.parseFloat(sc.next());
                if(userdata>=wbalance)
        {
            System.out.println("Your Balance is Low");
        }
        else
        {
            wbalance=wbalance-userdata;
            // System.out.println(wbalance+" w "+wbalance);
            m.setbalance(wbalance);
            System.out.println("withdrawal Successfull!");
        }
            } catch (NumberFormatException e) {
                //TODO: handle exception
                System.out.println("wrong input ! in do not enter any Alphabet or synbol");
            }
    }
}
