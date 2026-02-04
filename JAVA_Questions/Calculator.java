import java.util.Scanner;
class Calculator{
    static int calculate(int num1, int num2, int choice){
        switch(choice){
            case 1: System.out.println("Sum: "); return num1+num2;
            case 2: System.out.println("Difference: "); return num1-num2;
            case 3: System.out.println("Product: "); return num1*num2;
            case 4: System.out.println("Division: "); return num1/num2;
            case 5: System.out.println("Modulus: "); return num1%num2;
            default: System.out.println("Invalid choice"); return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus");
        System.out.println("Choose an operation:");
        int choice = sc.nextInt();
        Calculator obj = new Calculator();
        System.out.println(obj.calculate(num1,num2,choice));
    }
}
