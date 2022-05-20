import java.util.Scanner;

public class sum_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        sum = a + b;
        System.out.println("The sum is : " + sum);
    }
}
