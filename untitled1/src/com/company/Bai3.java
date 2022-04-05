package com.company;

import java.util.Random;

public class Bai3 {
    public static void main(String[] args) {
        randomclass();
        isPrimeNumber();
    }
    static void randomclass(){
        for(int i = 0; i < 5; i++){
            Random rd = new Random();
            int randum = rd.nextInt(100)+1;
            System.out.println("random: " + randum);
        }
    }
    public static boolean isPrimeNumber() {
        int n = 0;
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
