import java.util.Scanner;

class Analysis{
    void reverse(int num){
        int rev=0;
        while(num!=0){
            rev = rev*10 + num%10;
            num/=10;
        }
        System.out.println("Reverse: " + rev); 
    }
    void sum_digits(int num){
        int sum=0;
        while(num!=0){
            sum += num%10;
            num/=10;
        }
        System.out.println("Sum of digits: " + sum); 
    }
    void count_digits(int num){
        int cout=0;
        while(num!=0){
            cout++;
            num/=10;
        }
        System.out.println("No. of digits: " + cout); 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        Analysis obj = new Analysis();
        obj.reverse(num);
        obj.sum_digits(num);
        obj.count_digits(num);
    }
}