package com.company;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hight;
        System.out.printf("\n\nNhập vào chiều cao của tam giác: ");
        hight = sc.nextInt();
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }


        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        for(int i = 0; i< m;i++){
            for(int j = 0; j< n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
