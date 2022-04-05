package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai6 {

    public static void main(String args[]) {

        Pattern  pa = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");

                Scanner imput = new Scanner(System.in);
        System.out.println("nhập email: ");
        String email = imput.nextLine();

        if (pa.matcher(email).matches());


        Pattern  ta = Pattern.compile("^\\d{9,11}$\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập sdt: ");
        String sdt = sc.nextLine();

        if (pa.matcher(sdt).matches());



    }
}
