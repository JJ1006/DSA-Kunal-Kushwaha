public class MinimumAndMaximum {
    public static void main(String[] args) {
        int[] arr = {23,45,56,89,21,34,10};
        System.out.println("The minimum element is:- " + min(arr));
        System.out.println("The maximum element is:- " + max(arr));
    }
    static int min(int[] arr){
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }

    static int max(int[] arr){
        int minimim = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimim){
                minimim = arr[i];
            }
        }
        return minimim;
    }
}
