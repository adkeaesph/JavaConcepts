package org.example;

public class Test {

    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        mat[0] = new int[]{1, 2, 3};
        mat[1] = new int[]{1, 6, 3};
        mat[2] = new int[]{1, 2, 8};
        System.out.println(sumOfDiagonal(mat));
    }

    private static int sumOfDiagonal(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;

        int sum = 0;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(i==j) {
                    sum = sum + a[i][j];
                }
            }
        }
        return sum;
    }
}
