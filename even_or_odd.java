import java.util.Scanner;

public class even_or_odd {
    static void even_odd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println(n + " is even.");
        }else{
            System.out.println(n + " is odd");
        }
    }

    public static void main(String [] args) {
        even_odd();
    }
}
