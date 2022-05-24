import java.util.Scanner;

public class reverse_string {
    static void reverse_String(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        String original_str = str;
        String reversed_string=" ";
        char ch;

        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            reversed_string = ch + reversed_string;
        }System.out.print("The reversed string is: "+reversed_string);
    }

    public static void main(String[] args){
        reverse_String();
    }
}
