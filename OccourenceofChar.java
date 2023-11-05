package com.company;
import java.util.HashMap;
import java.util.Scanner;
import com.sun.jdi.IntegerType;

public class OccourenceofChar {
    public static void getCharcount(){
        HashMap<Character, Integer>map=new HashMap<Character,Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String givenStr=sc.nextLine();
        char charArray[]=givenStr.toCharArray();
        for (char c:charArray){
            if(map.containsKey(c)){
              map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args){
        getCharcount();
    }
}

