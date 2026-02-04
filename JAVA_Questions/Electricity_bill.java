import java.util.Scanner;

class Electricity_bill{
    static int net_bill(int units){
        int bill;
        if(units<=100){
            bill= 2*units;
        }
        else if(units>100 && units<=200){
            bill= 2*100 + 3*(units-100);
        }
        else{
            bill= 2*100 + 3*100 + 5*(units-200);
        }
        bill+=150;
        return bill;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units:");
        int units = sc.nextInt();
        Electricity_bill obj = new Electricity_bill();
        System.out.println("Net Electricity bill: " + obj.net_bill(units));
    }
}