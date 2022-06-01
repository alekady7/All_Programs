import java.util.Scanner;

public class max_min_method {
    public static int max(int num1, int num2, int num3){
        int max = num1;
        if(num2>max){
            max = num2;
        }
        if(num3>max){
            max = num3;
        }
        return max;
    }

    public static int min(int num1, int num2, int num3){
        int min=num1;
        if(num2<min){
            min = num2;
        }
        if(num3<min){
            min = num3;
        }
        return min;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Program to find largest and smallest of 3nos: \n");
        System.out.print("Enter 1st no: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd no: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd no: ");
        int num3 = sc.nextInt();

        int max = max(num1, num2, num3);
        int min = min(num1, num2, num3);

        System.out.print("largest no is: " + max+"\n");
        System.out.print("Smallest no is: " + min);
    }
}
