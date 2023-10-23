import java.util.Scanner;

public class runningSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the total number of elements in the array:- ");
        int total = in.nextInt();
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0 ; i<total; i++) {
        while (i>0){
            int add = arr[i-1];
            arr[i] += add;
            i -= 1;
        }
        }

        for (int i = 0; i <total ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
