import java.util.Scanner;

public class grade_calc {
    public static String grade(int n){
        if(n>=91){
            System.out.print("Grade is: AA");
        }else if(n>=81){
            System.out.print("Grade is: AB");
        }
        else if(n>=71){
            System.out.print("Grade is: BB");
        }
        else if(n>=61){
            System.out.print("Grade is: BC");
        }
        else if(n>=51){
            System.out.print("Grade is: CD");
        }
        else if(n>=41){
            System.out.print("Grade is: DD");
        }
        else{
            System.out.print("Grade is: FAIL");
        }
        return "Wrong Input";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("GRADE CALC");
        System.out.print("\n");
        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter no of subjects: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter your marks: ");
            n = sc.nextInt();
            grade(n);
            System.out.print("\n");
        }
    }
}
