import java.util.Scanner;

public class rev_number {
    public static boolean pal(int n){
        int rev=0,temp=n,ld;
        while(temp != 0){
            ld = temp % 10;
            rev = rev*10 + ld;
            temp /= 10;
        }
        return (rev == n);
    }

    public static void main(String[] args) {
        System.out.print("Enter a no: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(pal(n));
    }
}
