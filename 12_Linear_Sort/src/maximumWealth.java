public class maximumWealth {
    public static void main(String[] args) {
        int[][] twoArr = new int[3][2];
        twoArr[0][0] = 1;
        twoArr[0][1] = 5;
        twoArr[1][0] = 7;
        twoArr[1][1] = 3;
        twoArr[2][0] = 3;
        twoArr[2][1] = 5;

        System.out.println("The 2D array is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(twoArr[i][j] + " ");
            }
        }

        System.out.println("Now finding the maximum of the arrays:- ");

        int largest = twoArr[0][0];
        for(int customer[] : twoArr){
            int currentSum = 0;
            for(int bank : customer) currentSum += bank;
            largest = Math.max(largest, currentSum);
        }

    }
    }
