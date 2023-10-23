public class diagonalSum {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        mat[0][0] = 7;
        mat[0][1] = 9;
        mat[0][2] = 8;
        mat[0][3] = 6;
        mat[0][4] = 3;
        mat[1][0] = 3;
        mat[1][1] = 9;
        mat[1][2] = 4;
        mat[1][3] = 5;
        mat[1][4] = 2;
        mat[2][0] = 8;
        mat[2][1] = 1;
        mat[2][2] = 10;
        mat[2][3] = 4;
        mat[2][4] = 10;
        mat[3][0] = 9;
        mat[3][1] = 5;
        mat[3][2] = 10;
        mat[3][3] = 9;
        mat[3][4] = 6;
        mat[4][0] = 7;
        mat[4][1] = 2;
        mat[4][2] = 4;
        mat[4][3] = 10;
        mat[4][4] = 0;

        System.out.println(mat.length);

        //for odd length of matrix
        int ans = 0;
        if (mat.length % 2 != 0){
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if (i == j){
                        ans = ans + mat[i][j];
                        System.out.println("Answer:- " + ans + " matrix value:- " + mat[i][j]);
                    }
                }
            }
            System.out.println("New answer here");
            if (mat.length > 2) {
                ans = ans + mat[0][mat.length - 1] + mat[mat.length - 1][0];
                System.out.println("Answer:- " + ans);
                System.out.println("mat[0][mat.length - 1] " + mat[0][mat.length - 1]);
                System.out.println("mat[mat.length - 1][0] " + mat[mat.length - 1][0]);
            }
        }

        System.out.println(ans);


        if (mat.length % 2 == 0){
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if (i == j){
                        ans = ans + mat[i][j];
                        System.out.println("Answer:- " + ans + " matrix value:- " + mat[i][j]);
                    }
                    if (i + j == mat.length - 1){
                        ans = ans + mat[i][j];
                    }
                }
            }
        }

        System.out.println(ans);

    }
}
