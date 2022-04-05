package com.company;

public class Bai5 {
    public static void main(String args[]) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            if (i == j){
                    System.out.println(a[i][j]);
                }
            }
        }


        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        int[][] c = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(a[i][j] + b[i][j]);
            }
            System.out.println();
        }
        }
    }

