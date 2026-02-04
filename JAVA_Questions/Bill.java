import java.util.Scanner;
class Bill{
    void net_bill(int price, int quantity){
        int bill = price*quantity;
        if(bill>=2000){
            bill = bill - (bill*5/100);
        }
        else if(bill>=5000){
            bill = bill - (bill*10/100);
        }
        bill = bill + (bill*18/100);
        System.out.println("Net bill: " + bill);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of item:");
        int price = sc.nextInt();
        System.out.println("Enter quantity of item:");
        int quantity = sc.nextInt();
        Bill obj = new Bill();
        obj.net_bill(price, quantity);
    }
}