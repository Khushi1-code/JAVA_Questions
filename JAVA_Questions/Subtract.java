import java.util.Scanner;
class Subtract{
    void sub(int num1, int num2){
        while(num2!=0){
            int borrow=(~num1)&(num2);
            num1=num1^num2;
            num2=borrow<<1;
        }
        System.out.println("Difference: " + num1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        Subtract obj = new Subtract();
        obj.sub(num1, num2);
    }
}