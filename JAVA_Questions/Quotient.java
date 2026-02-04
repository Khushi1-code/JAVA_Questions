import java.util.Scanner;

class Quotient {

    void findQuotient(int dividend, int divisor) {
        int quotient = 0;

        while (dividend >= divisor) {
            dividend = dividend - divisor;
            quotient++;
        }

        System.out.println("Quotient: " + quotient);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dividend:");
        int dividend = sc.nextInt();

        System.out.println("Enter divisor:");
        int divisor = sc.nextInt();

        Quotient obj = new Quotient();
        obj.findQuotient(dividend, divisor);
    }
}
