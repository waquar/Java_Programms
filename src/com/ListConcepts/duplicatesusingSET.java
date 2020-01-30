package com.ListConcepts;

import java.util.HashSet;
import java.util.Set;

public class duplicatesusingSET {
    public static void main(String[] args){
       String s = "Hello World" ;
       char[]  ca = s.toCharArray();
       int counter = 0;

       Set<Character> set = new HashSet<Character>();
       for (int i = 0; i < ca.length; i++){
           if(!set.add(ca[i])) {                   //if not true then duplicate
               System.out.println(i);
               counter++;
           }
       }
        System.out.println("counter duplicate value : " + counter);

    }
}



