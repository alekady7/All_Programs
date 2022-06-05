import java.util.Scanner;

public class lcm {
    public static int hcf(int a, int b){
        if(b == 0)
            return a;
        else
            return hcf(b, a%b);
    }

    public static int lcm(int a, int b){
        return (a*b)/hcf(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        hcf(a, b);
        System.out.print("Lcm is: " + lcm(a, b));
    }
}
