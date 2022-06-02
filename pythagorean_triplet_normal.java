import java.util.Scanner;

public class pythagorean_triplet_normal {
    public static String pythagorean(int n1,int n2,int n3){
        if((n1*n1)+(n2*n2) == (n3*n3)){
            return " pythagorean triplet";
        }else if((n3*n3)+(n2*n2) == (n1*n1)){
            return " pythagorean triplet";
        }else if((n1*n1)+(n3*n3) == (n2*n2)){
            return " pythagorean triplet";
        }else{
            return " not a pythagorean triplet";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another no: ");
        int num2 = sc.nextInt();
        System.out.print("Enter another no: ");
        int num3 = sc.nextInt();
        System.out.print(pythagorean(num1,num2,num3));
    }
}
