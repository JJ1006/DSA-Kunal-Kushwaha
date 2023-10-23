class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] answerarray = new int[matrix[0].length][matrix.length];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // if (i == j){
                //     answerarray[i][j] = matrix[i][j];
                // }
                // else {
                answerarray[j][i] = matrix[i][j];
                // }
            }
        }

        return answerarray;
    }
}