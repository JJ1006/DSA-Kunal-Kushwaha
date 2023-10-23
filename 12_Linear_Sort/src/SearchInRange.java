import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the total number of elements in the array:- ");
        int numberofelements = in.nextInt();
        int[] arr = new int[numberofelements];
        for (int i = 0; i < numberofelements; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Please enter the first index and last index between which you want to search:- ");
        int searchstart = in.nextInt();
        int searchend = in.nextInt();

        System.out.print("Please enter the element you want to search:- ");
        int target = in.nextInt();

        boolean answer = searchBetween(arr, searchstart, searchend, target);
        System.out.println(answer);
    }

    static boolean searchBetween(int[] arr, int searchstart, int searchend, int target) {
        for (int i = searchstart; i < searchend; i++) {
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }
}
