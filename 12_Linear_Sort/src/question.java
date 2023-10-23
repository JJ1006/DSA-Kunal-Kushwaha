import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the total number of elements in the array:- ");
        int total = in.nextInt();
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("hello from here");
//        for (int i = 0; i < total; i++) {
            while (total - 1>0){
                System.out.println("total " + total);
                int add = arr[total-2];
                arr[total - 1] = arr[total - 1] + add;
                total--;
            }
//        }

        System.out.println("output---");

        for (int i = 0; i < total; i++) {
            System.out.println(arr[i]);
        }
    }
}
