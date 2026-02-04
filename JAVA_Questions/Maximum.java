import java.util.Scanner;

class Maximum{

    void max(int a, int b) {

        int diff = a - b;
        int sign = diff >> 31; 
        int maximum = a - sign * diff;
        System.out.println("Maximum: " + maximum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        Maximum obj = new Maximum();
        obj.max(a, b);
    }
}
