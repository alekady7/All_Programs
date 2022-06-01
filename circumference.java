import java.util.Scanner;

public class circumference {
    public static double circumference_circle(int num1, double pi){
        double circumference = 2*num1*pi;
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num1 = sc.nextInt();
        double pi = 3.14;
        System.out.println(circumference_circle(num1, pi));
    }
}
