import java.util.Scanner;

public class sum_using_method {
    public static int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static int mul(int num1, int num2){
        int mul = num1 * num2;
        return mul;
    }

    public static int sub(int num1, int num2){
        int sub = num1 - num2;
        return sub;
    }

    public static int div(int num1, int num2){
        int div = num1 / num2;
        return div;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another no: ");
        int num2 = sc.nextInt();
        System.out.print("Sum is : " + sum(num1, num2)+"\n");
        System.out.print("mul is : " + mul(num1, num2)+"\n");
        System.out.print("Sub is : " + sub(num1, num2)+"\n");
        System.out.print("div is : " + div(num1, num2));
    }
}
