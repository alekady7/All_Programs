import java.util.Scanner;

public class calculator_if {
    public static void calc_if(){
        int n1,n2;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        n1 = sc.nextInt();
        System.out.print("Enter a operator: ");
        op = sc.next().charAt(0);
        System.out.print("Enter a no: ");
        n2 = sc.nextInt();
        if(op == '+'){
            int sum = n1 + n2;
            System.out.print(n1 + "+" + n2 + "="+ sum);
        }
        else if(op == '-'){
            int min = n1 - n2;
            System.out.print(n1 + "+" + n2 + "="+ min);
        }
        else if(op == '*'){
            int mul = n1 * n2;
            System.out.print(n1 + "+" + n2 + "="+ mul);
        }else if(op == '/'){
            int div = n1 / n2;
            System.out.print(n1 + "+" + n2 + "="+ div);
        }else {
            System.out.print("Wrong input");
        }
    }

    public static void main(String [] args){
        calc_if();
    }
}
