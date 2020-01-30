package com.ListConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Usingset {

    public static void main(String[] args){
        String[] ar = {"waq","uar","ala","uar","man","sa","ri"};

        HashSet <String> hs = new HashSet<>();

        hs.add("waq");
        hs.add("uar");
        hs.add("ala");
        hs.add("uar");
        hs.add("man");
        hs.add("sa");
        hs.add("ri");
        //System.out.println(hs.equals(ar));
        System.out.println(ar.length);
        System.out.println(hs.size());


        }
    }

