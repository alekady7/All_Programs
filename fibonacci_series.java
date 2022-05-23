import java.util.Scanner;

public class fibonacci_series {
    public static void fibonacci_num(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num = sc.nextInt();
        int n1=0,n2=1;
        System.out.println("Fibonacci series upto no " + num + " is: ");
        for(int i=1;i<=num;i++){
            System.out.print(n1+", ");
            int n3 = n1+n2;
            n1=n2;
            n2=n3;
        }
    }

    public static void main(String[] args){
        fibonacci_num();
    }
}
