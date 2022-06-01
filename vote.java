import java.util.Scanner;

public class vote {
    public static void eligible(String name, int age){
        if(age>=18){
            System.out.print(name + " is eligible");
        }else{
            System.out.print(name + " is not eligible");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ELIGIBLE OR NOT!!\n");
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        eligible(name, age);
    }
}
