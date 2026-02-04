import java.util.Scanner;

class PowerOfTwo {

    void check(int num) {

        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        PowerOfTwo obj = new PowerOfTwo();
        obj.check(num);
    }
}
