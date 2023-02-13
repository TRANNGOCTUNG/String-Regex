package test;

import java.util.Arrays;
import java.util.Locale;



public class UpToUpDown {
    public static void main(String[] args) {
        String b = "HANOI University of Science and Technology";
        char[] str =  new char[b.length()];
//        String b = Arrays.toString(a.split(""));
//        System.out.println(b);
        for (int i = 0; i < b.length(); i++) {
            char value = b.charAt(i);
            if (value >= 'a' && value <= 'z') {
                value = Character.toUpperCase(b.charAt(i));
            } else if (value >= 'A' && value <= 'Z') {
               value = Character.toLowerCase(b.charAt(i));
            }
            str[i] = value;
            System.out.print(str[i]);
        }

    }
}