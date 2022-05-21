import java.util.Scanner;

public class press_x {
    public static void main(String[] args) {
        //char a = 'x';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=0,sum=0;
        int num = 5;
        while(n != num){
            n = sc.nextInt();
            sum += n;
        }
        System.out.println("program ended");
        System.out.println("The sum is: " + sum);
    }
}
