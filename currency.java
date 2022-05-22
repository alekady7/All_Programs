import java.util.Scanner;

public class currency {
    public static void currency(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double rupee,dollar;
        rupee = sc.nextDouble();
        double value = 77.82;
        dollar = rupee/value;
        System.out.println("Your value in dollars is: "+String.format("%.2f",dollar));
    }

    public static void main(String[] args){
        currency();
    }
}
