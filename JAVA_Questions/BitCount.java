import java.util.Scanner;

class BitCount{

    void count(int num) {
        int count = 0;

        while (num != 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }

        System.out.println("Set bits count: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        BitCount obj = new BitCount();
        obj.count(num);
    }
}
