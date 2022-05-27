import java.util.Scanner;

public class factorial {
    static void factorial_number(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num = sc.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial *= i;
        }System.out.print(factorial);
    }

    public static void main(String[] args){
        factorial_number();
    }
}
