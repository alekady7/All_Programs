import java.util.Scanner;

public class trailing_zeroes {
    public static int totalTrailing(int n){
        int res = 0;
        for(int i=5;i<=n;i *= 5){
            res += n/i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        System.out.print(totalTrailing(n));
    }
}
