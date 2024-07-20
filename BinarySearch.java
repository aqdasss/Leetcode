public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,12,15,20};
        int target = 12;
        int ans = BinaryS(arr, target);
        System.out.println(ans);
        
    }

    static int BinaryS(int[] arr, int targer){
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end-start)/2;
            if (targer<arr[mid]) {
                end = mid -1;
            }
            else if(targer>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }
}
