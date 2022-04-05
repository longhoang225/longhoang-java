package com.company;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        //      bmi < 18.5 => gầy
//        bmi >= 18.5 && <= 24.9 bình thường
//        bmi >= 25 => béo

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao: ");
        double height = sc.nextDouble();
        double weight = sc.nextDouble();

        double bmi = weight/(height*height);

        if(bmi < 18.5){
            System.out.println("gầy");
        }else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("bình Thường");

        }else {
            System.out.println("thừa cân");
        }
    }
}
