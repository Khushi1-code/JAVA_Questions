import java.util.Scanner;
class Test{
    static void nature(int num){
        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Negative");
        }
    }
    static void even_odd(int num){
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    static void divisible(int num){
        if(num%35==0){
            System.out.println("Yes, divisible by both 5 & 7");
        }
        else{
            System.out.println("No, not divisible by both 5 & 7");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        Test obj = new Test();
        obj.nature(num);
        obj.even_odd(num);
        obj.divisible(num);
    }
}