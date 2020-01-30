package com.ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iteratingarraylists {
    public static void main(String[] args){

        ArrayList a1 = new ArrayList();
        a1.add("taarak");
        a1.add("mehta");
        a1.add("ka");
        a1.add("ooltah");
        a1.add("chasmah");

        // after java8 we can use this foreach
        a1.forEach(tvshow -> {
            System.out.println(tvshow);
        });

        System.out.println("*******separator********");
        // using iterator
        Iterator<String> i1 = a1.iterator();
        while (i1.hasNext()){
            String tvshow = i1.next();
            System.out.println(tvshow);
        }
        System.out.println("*******separator********");

        // using for eachremainingmethod java8
        i1 = a1.iterator();
        i1.forEachRemaining(tvshow -> {
            System.out.println(tvshow);
        });


        System.out.println("*******separator********");

        for(Object show : a1){
            System.out.println("shoe" + show);
        }

        //using for loop with order/index
        for(int i = 0; i < a1.size(); i++){
            System.out.println(a1.get(i));
        }

        System.out.println("*******separator********");
        //using list iterator to traverse both direction
        ListIterator<String > tvs = a1.listIterator(a1.size());
        //print backward
        while(tvs.hasPrevious()){
            String s2 = tvs.previous();
            System.out.println(s2);
        }
        //print forwarding
        while(tvs.hasNext()){
            String s3 = tvs.next();
            System.out.println(s3);
        }

       // Use hashmap , store character as key and count of occurrences of each character as value

    }
}
