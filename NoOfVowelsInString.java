//Count the number of vowels in the given String.
package com.company;
import java.util.Scanner;
public class NoOfVowelsInString {
    public static void main(String[] args) {
        NoOfVowelsInString VowelsInString = new NoOfVowelsInString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String inputStr = scanner.nextLine();
        if (inputStr == null || inputStr.isEmpty()) {
            System.out.println("String cannot be empty");
            return;
        }
        int count = VowelsInString.vowelCount(inputStr);
        System.out.println("Totally " + count + " vowels");
    }
    public static int vowelCount(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null");
        }
        int countVowel = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                countVowel++;
            }
        }
        return countVowel;
    }
}
