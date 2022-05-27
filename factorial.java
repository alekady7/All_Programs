import java.util.Scanner;

public class factorial {
    static void factorial_number(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num = sc.nextInt();
        int factorial=1;
        if(num > 0) {
            for(int i=1;i<=num;i++){
                factorial *= i;
            }System.out.print(factorial);
        }else{
            System.out.print("0");
        }
    }

    public static void main(String[] args){
        factorial_number();
    }
}
