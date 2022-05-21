import java.util.Scanner;

public class simple_interest {
    public static void simpleInterest(){
        float p,r,t,simp=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        p = sc.nextFloat();
        System.out.print("Enter rate: ");
        r = sc.nextFloat();
        System.out.print("Enter time(hrs): ");
        t = sc.nextFloat();
        simp = (p*r*t)/100;
        System.out.print("Simple interest is: " + simp);
    }

    public static void main(String [] args){
        simpleInterest();
    }
}
