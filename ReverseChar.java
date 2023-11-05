package com.company;
import java.util.Scanner;
public class ReverseChar {
    public static void reversecharacter(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String givenStr=sc.nextLine();
        String reversedStr="";
        char[] givenstrchararray=givenStr.toCharArray();
        for (int i=givenstrchararray.length-1;i>=0;i--) {
            reversedStr = reversedStr + givenstrchararray[i];
        }
        System.out.println(reversedStr);
    }
    public static void main(String[] args){
        reversecharacter();
    }
}
