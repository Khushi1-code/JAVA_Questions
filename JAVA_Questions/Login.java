import java.util.Scanner;
class Login{
    void login(String username, String password){
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=3; i++){
            System.out.println("Enter username:");
            String str1 = sc.next();
            System.out.println("Enter password:");
            String str2 = sc.next();
            if(str1.equals(username) && str2.equals(password)){
                System.out.println("Successfully Logged In!");
                break;
            }
            else{
                if(i!=3){
                System.out.println("Failed! Only " + (3-i) + " attempts left!");
                }
                else{
                    System.out.println("System Locked!");
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pre-defined username:");
        String username = sc.next();
        System.out.println("Enter pre-defined password:");
        String password = sc.next();
        Login obj = new Login();
        obj.login(username, password);
    }
}
