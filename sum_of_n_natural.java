import java.util.Scanner;

public class sum_of_n_natural {
    public static int sum(int n){
        int i=1,sum=0;
        while(i<=n){
            sum += i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of first n natural number!!");
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
}
