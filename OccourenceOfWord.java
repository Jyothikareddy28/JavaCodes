package com.company;
import java.util.Scanner;
import java.util.HashMap;
import java.lang.String;
public class OccourenceOfWord {
    public void getcountWord(String string){
        HashMap<String,Integer>map=new HashMap<String,Integer>();
        String[] strArray=string.split(" ");
        for(String s : strArray){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args){
        OccourenceOfWord occurence= new OccourenceOfWord();
        occurence.getcountWord("try and try until you die");
    }

}
