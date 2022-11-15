import java.util.Arrays;

public class second_largest_element {
    public static void main(String[] args) {
        int arr[] = {24 ,15, 32, 35, 28};
        secondLargest(arr);
    }

    static void secondLargest(int arr[]){

        if(arr.length<2){
            System.out.println("Invalid array");
        }

        Arrays.sort(arr);

        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i] != arr[n-1]){
                System.out.printf("Second largest element is: %d", arr[i]);
            }
            return;
//            else{
//                System.out.printf("Second largest element is: ", arr[i-1]);
//            }
        }
        System.out.println("No second largest element");
    }
}
