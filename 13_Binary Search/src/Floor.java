public class Floor {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = {23,45,67,89,99}; // the array is in ascending order
        int target = 60;
        int ans = floor(arr,  target);
        System.out.println(ans);
//        System.out.println("The element is at number " + ans + " index of the array.");
    }

    public static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }

        return end;
    }
}