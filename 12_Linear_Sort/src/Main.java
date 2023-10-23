import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int num = in.nextInt();

        int array[] = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        for (int i = 0 ; i < array.length; i++ ) {
            array[i] = in.nextInt();
        }

        System.out.print("Please enter the number you want to check:- ");
        int number = in.nextInt();
        boolean answer = numberCheck(array, number);
        System.out.println(answer);

    }
    static boolean numberCheck(int[] array, int number){
        for(int element: array){
            if (number == element){
                return true;
            }
        }
        return false;
    }
}