import java.util.Scanner;

public class gcd {
    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int a = sc.nextInt();
        System.out.print("Enter a no: ");
        int b = sc.nextInt();
        System.out.print(gcd(a, b));
    }
}
