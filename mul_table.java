import java.util.Scanner;

public class mul_table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i=0;i<=n;i++){
            int number = i*n;
            System.out.println(n+"*"+i+" = "+number);
        }
    }
}
