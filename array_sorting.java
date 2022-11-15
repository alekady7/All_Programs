import java.util.Arrays;
import java.util.*;
import java.util.Collections;

public class array_sorting {
    public static void main(String[] args) {
        int arr[] = {24, 15, 35, 34, 28};

        Arrays.sort(arr); //sorts the array in ascending order
        reverse(arr); //sorts the array in descending order



    }

    public static void reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
