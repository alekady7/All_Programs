import java.util.Scanner;

public class factorial_using_recursion {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            int fact = n * factorial(n-1);
            return fact;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num = sc.nextInt();
        System.out.print("Factorial is: " + factorial(num));
    }
}
