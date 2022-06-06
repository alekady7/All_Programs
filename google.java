import java.util.Scanner;

public class google {
    public static boolean google_code(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int k = sc.nextInt();

        //function start
        for(int i=0;i<arr.length;i++){
            //int b = arr[i];
            for(int j=1;j<arr.length;j++){
                if(arr[i]+arr[j] == k){
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(google_code(arr));
    }
}
