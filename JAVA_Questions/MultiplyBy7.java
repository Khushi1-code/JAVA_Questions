import java.util.Scanner;

class MultiplyBy7{

    void multiply(int num) {
        int result = (num << 3) - num; 
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        MultiplyBy7 obj = new MultiplyBy7();
        obj.multiply(num);
    }
}
