import java.util.Scanner;

public class hcf {
    static void hfc_finder(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another no: ");
        int num2 = sc.nextInt();
        int hcf=0,i;
        for(i=1;i<=num1 || i<=num2;i++){
            if(num1%i == 0 && num2%i == 0){
                hcf = i;
            }
        }
        System.out.print("hcf is: "+hcf);
    }

    public static void main(String[] args){
        hfc_finder();
    }
}
