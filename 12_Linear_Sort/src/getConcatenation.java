import java.util.Scanner;

public class getConcatenation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the total number of elements in the array:- ");
        int total = in.nextInt();
        int[] arr = new int[total];
        int[] finalarr = new int[2 * total];
        System.out.println("Please enter the array elements:- ");
        for (int i = 0; i < total; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < total; i++) {
            finalarr[i] = arr[i];
        }

        System.out.println("I am here");

        for (int i = 0; i < total; i++) {
            int neki = arr[i];
            finalarr[i + total] = neki;
            System.out.println("neki---" + neki);
        }

        System.out.println("output---");

        for (int i = 0; i < finalarr.length; i++) {
            System.out.print(finalarr[i] + " ");
        }

    }
}
