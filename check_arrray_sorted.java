public class check_arrray_sorted {
    public static void main(String[] args) {
        int arr[] = {24, 15, 16, 28, 35, 32};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
