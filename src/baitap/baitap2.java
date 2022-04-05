package baitap;

import java.util.Locale;

public class baitap2 {
    public static void main(String[] args) {
        String str = "hoàng lê long";
        System.out.println(str);

        String firsLetter = str.substring(0, 1);
        String remaniningletter = str.substring(1, str.length());

        firsLetter = firsLetter.toUpperCase(Locale.ROOT);

        str = firsLetter + remaniningletter;

        System.out.println(str);

    }
}
