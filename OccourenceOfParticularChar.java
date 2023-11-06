//Java program to count the occurrences of a particular character in a String
package com.company;

import java.util.Scanner;

public class OccourenceOfParticularChar {
    public static void main(String[] args) {
        occourenceOfCharinString("Jyothikaa");
    }

    public static void occourenceOfCharinString(String str) {
        int repeats = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character to be found : ");
        char toFind = scanner.next().charAt(0);
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (toFind == charArray[i]) {
                repeats++;
            }
        }
        System.out.println("character " + toFind + " repeats " + repeats + " times");
    }
}
