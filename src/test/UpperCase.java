package test;

import java.util.Arrays;
import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        String a = "HANOI University of Science and Technology";
        for (int i = 0; i < a.length(); i++) {
            char value = a.charAt(i);
            if(value >= 'a' && value <= 'z'){
                value = Character.toUpperCase(a.charAt(i));
            } else if (value >= 'A' && value <= 'Z') {
                value = Character.toLowerCase(a.charAt(i));
            }
            System.out.print(value);
        }
    }
}

