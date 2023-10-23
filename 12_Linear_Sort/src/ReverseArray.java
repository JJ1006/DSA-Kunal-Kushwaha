import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the total number of elements in the array:- ");
        int total = in.nextInt();
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < total/2; i++) {
            int temp = arr[i];
            arr[i] = arr[total - 1 - i];
            arr[total - 1 - i] = temp;
        }

        System.out.println("The reversed array is:- ");

        for (int i = 0; i <total ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
