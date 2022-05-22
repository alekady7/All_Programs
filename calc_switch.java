import java.util.Scanner;

public class calc_switch {
    public static void calculator(){
        int n1,n2;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        n1 = sc.nextInt();
        System.out.print("Enter a operator: ");
        op = sc.next().charAt(0);
        System.out.print("Enter a no: ");
        n2 = sc.nextInt();
        switch(op){
            case '+':
                int sum = n1 + n2;
                System.out.print(n1 + "+" + n2 + "="+ sum);
                break;
            case '-':
                int min = n1 - n2;
                System.out.print(n1 + "-" + n2 + "="+ min);
                break;
            case '*':
                int mul = n1 * n2;
                System.out.print(n1 + "*" + n2 + "="+ mul);
                break;
            case '/':
                int div = n1 / n2;
                System.out.print(n1 + "/" + n2 + "="+ div);
                break;
            default:
                System.out.println("Wrong input!!");
        }
        }
    public static void main(String [] args) {
        calculator();
    }
}
