import java.util.Scanner;

class Swap{

    void swapNumbers(int a, int b) {

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a:");
        int a = sc.nextInt();

        System.out.println("Enter value of b:");
        int b = sc.nextInt();

        Swap obj = new Swap();
        obj.swapNumbers(a, b);
    }
}
