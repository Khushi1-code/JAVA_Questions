import java.util.Scanner;

public class Multiplication {

    static int add(int x, int y) {
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }

    static int multiply(int a, int b) {
        int result = 0;
        while (b != 0) {
            if ((b & 1) == 1)
                result = add(result, a);
            a <<= 1;
            b >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(multiply(a,b));
    }
}