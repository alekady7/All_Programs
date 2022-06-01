import java.util.Scanner;

public class prime_nonprime {
    public static boolean prime(int num){
        if(num<1){
            return false;
        }
        if(num<=3){
            return true;
        }
        if(num%2 == 0 || num%3==0){
            return false;
        }
        for(int i=5;i*i <= num;i = i + 6){
            if(num%i == 0 || num%(i+2) == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("PRIME OR NOT!!");
        System.out.println("Enter a no: ");
        int num = sc.nextInt();
        System.out.println(num +": " + prime(num));
    }
}
