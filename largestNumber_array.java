public class largestNumber_array {
    static int getLargestNo(int[] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[res]) {
                res = i;
                return arr[res];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {49, 52, 12, 23};
        System.out.println(getLargestNo(arr));
    }
}
