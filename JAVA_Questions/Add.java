import java.util.Scanner;
class Add{
    void sum(int num1, int num2){

    while (num2 != 0) {
      int sum = num1 ^ num2;
      int carry = (num1 & num2) << 1;
      num1 = sum;
      num2 = carry;
    }
    System.out.println("Sum: " + num1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        Add obj = new Add();
        obj.sum(num1, num2);
    }
}