import java.util.Scanner;
class Prime{
    void prime(int start, int end){
        System.out.println("Prime numbers:");
        for(int i=start; i<=end; i++){
            int flag=1;
            for(int j=2; j*j<=i; j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.print(i + "\t");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting point");
        int start = sc.nextInt();
        System.out.println("Enter ending point");
        int end = sc.nextInt();
        Prime obj = new Prime();
        obj.prime(start, end);
    }
}