import java.util.Scanner;

class ParityCheck {

    void checkParity(int num) {

        if ((num & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        ParityCheck checker = new ParityCheck();
        checker.checkParity(num);
    }
}
