package assignment_1;

public class Balance {
    private float balance=1000;
    public float getbalance()
    {
        return balance;
    }
    public void setbalance(float balance){
            this.balance=balance;
    }
    public void balance(){
        System.out.println("your Balance is :"+getbalance());
    }
    public static void main(String[] args) {
        Balance b=new Balance();
            System.out.println(b.getbalance());
            // b.setbalance(2000);
            // System.out.println(b.getbalance());
            // System.out.println();

    }
}
