import java.util.Scanner;

public class sum_until_0_pressed {
    static void sum_of_user_input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int input=0,max=0;
        while((input = sc.nextInt()) != 0){
            if(max<input){
                max = input;
            }
        }
        System.out.print("The largest elements are: "+max);
    }

    public static void main(String[]args){
        sum_of_user_input();
    }
}
