import java.util.Scanner;
class Salary{
    static int net_salary(int base){
        int salary;

        if(base>=30000){
            salary = (base + (base*20/100) + (base*15/100)) - (base*12/100);
        }
        else{
            salary = (base + (base*10/100) + (base*8/100)) - (base*12/100);
        }
        return salary;

    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base salary:");
        int base = sc.nextInt();
        Salary obj = new Salary();
        System.out.println(obj.net_salary(base));
    }
}