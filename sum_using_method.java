import java.util.Scanner;

public class sum_using_method {
    public static int sum(int num1, int num2){
        int sums = num1 + num2;
        return sums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another no: ");
        int num2 = sc.nextInt();
        System.out.print("Sum is : " + sum(num1, num2));
    }
}
