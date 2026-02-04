import java.util.Scanner;
class ATM{
    void check(int balance, int withdraw){
        if(withdraw%100==0 && (balance-withdraw)>=1000){
            System.out.println("Successful");
        }
        else
            System.out.println("Failed!");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current account balance:");
        int balance = sc.nextInt();
        System.out.println("Enter withdrawal amount:");
        int withdraw = sc.nextInt();
        ATM obj = new ATM();
        obj.check(balance,withdraw);
    }
}