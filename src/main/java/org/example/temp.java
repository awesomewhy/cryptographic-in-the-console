package org.example;

import java.util.Arrays;
import java.util.Random;

public class temp {
    private final static int MATRIX_SIZE_VERTICALLY = 10;
    private static int MATRIX_SIZE_HORIZONTALLY = 100;
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String RESET = "\033[0m";


    public static void main(String[] args) {
        int[][] tmp = create();

        stdOutMatrix(tmp);
    }

    public static int[][] create() {
        int[][] matrix = new int[MATRIX_SIZE_VERTICALLY][MATRIX_SIZE_HORIZONTALLY];

        Random random = new Random();
        int[] res;
        int temp2 = 0;

        int temp = 20;
        int counter = 0;
        int cur = 0;

        int prev = 0;
        while (temp != 0) {
            int to = random.nextInt(1, 11);
            if (counter == 0) {
                res = fillMatrix(matrix, 0, to, temp2);
                temp2 = res[1];
                cur = to;
                prev = to;
            } else if (prev < 30) {
                res = fillMatrix(matrix, cur, to, temp2);
                temp2 = res[1];
                cur = res[0];
            }

            ++counter;
            --temp;
        }


        return matrix;
    }

    public static void stdOutMatrix(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; --i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] == 1) {
                    System.out.print(RED + matrix[i][j] + RESET + " ");
                    continue;
                }
                if (matrix[i][j] == 2) {
                    System.out.print(GREEN + matrix[i][j] + RESET + " ");
                    continue;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static int[] fillMatrix(int[][] matrix, int i, int to, int temp2) {
        if (i < to) {
            while (i < to) {
                matrix[i][temp2] = 2;
                ++temp2;
                ++i;
            }
        }

        if (i > to) {
            while (i > to) {
                --i;
                matrix[i][temp2] = 1;
                ++temp2;
            }
        }


        return new int[]{i, temp2};
    }
}
