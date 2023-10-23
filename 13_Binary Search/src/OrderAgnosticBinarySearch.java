public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = {99, 87,77, 76, 54}; // the array is in descending order
        int target = 76;
        int ans = 0;
        if(arr[0] > arr[arr.length - 1]) {
             ans = binarySearchDescending(arr, target);
        }

        else {
             ans = binarySearchAscending(arr, target);
        }

        System.out.println(ans);
//        System.out.println("The element is at number " + ans + " index of the array.");
    }

    public static int binarySearchDescending(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = start + 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }


    public static int binarySearchAscending(int[] arr, int target){
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

        return -1;
    }
}