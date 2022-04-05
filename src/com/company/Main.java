package com.company;

public class Main {

    public static void main(String[] args) {
	int a = 17;
    int b = 10;
//        System.out.println(a<b);
        if (a < b) {
            System.out.println("a nhỏ hơn b");
        }else if(a>b){
            System.out.println("a lớn hơn hoặc bằng b");
        }else {
            System.out.println("a bằng b");
        }
//
        if(a<b){
            System.out.println("a nhỏ hơn b");
        }else {
            if (a == b) {
                System.out.println("a bằng b");
            }
        }



//      bmi < 18.5 => gầy
//        bmi >= 18.5 && <= 24.9 bình thường
//        bmi >= 25 => béo


    }
}
