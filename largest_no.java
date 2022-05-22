import java.util.Scanner;

public class largest_no {
    public static void largest_num(){
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        n1 = sc.nextInt();
        System.out.print("Enter a no: ");
        n2 = sc.nextInt();
        System.out.print("Enter a no: ");
        n3 = sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1 + " is largest");
        }else if(n2>n1 && n2>n3){
            System.out.println(n2 + " is largest");
        }else if(n1>n2 && n1<n3){     //I've taken n1<n3 instead of n3>n1 and n3>n2
            System.out.println(n3 + " is largest");
        }
    }

    public static void main(String [] args){
        largest_num();
    }
}
