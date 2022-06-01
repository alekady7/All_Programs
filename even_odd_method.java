import java.util.Scanner;

public class even_odd_method {
    public static void even_odd(int num){
        if(num%2 == 0){
            System.out.print(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num = sc.nextInt();
        even_odd(num);
    }
}
