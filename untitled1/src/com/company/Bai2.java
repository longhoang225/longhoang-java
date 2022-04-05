package com.company;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhap vao mot chuoi: ");
        Scanner input = new Scanner(System.in);
        String ct = input.nextLine();
        int i = 0;
        for (int j = 0; j < ct.length(); j++){
            if (j == ct.length()-1){
                i += 0;
            }else{
                if (ct.charAt(j) == ' '){
                    if ((ct.charAt(j+1) == '\n') || (ct.charAt(j+1) == ' ')){
                        i += 0;
                    }else{
                        i++;
                    }
                }
            }
        }
        if (ct.charAt(0) == ' '){
            System.out.println(i);
        }else{
            System.out.println(i+1);
        }


            String chuoi;
            char kyTu = 'o';
            int count = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nhập vào chuỗi bất kỳ: ");
            chuoi = scanner.nextLine();


            for (; i < chuoi.length(); i++) {

                if (chuoi.charAt(i) == kyTu) {
                    count++;
                }
            }

            System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                    " trong chuỗi " + chuoi + " = " + count);

    }
}

