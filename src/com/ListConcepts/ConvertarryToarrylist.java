package com.ListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertarryToarrylist {
    public static void main(String[] args) {
        String[] allcodes = {"001", "002", "003", "004", "005", "006", "007", "008"};
        String[] reservedcodes = {"003", "008"};
        String[]  freecodes = unreserved(allcodes, reservedcodes);
        System.out.println(Arrays.toString(freecodes));
    }

        static String[] unreserved(String[] allcodes, String[] reservedcodes){
        //converting array to arraylist
        List<String> list1 = new ArrayList<String>(Arrays.asList(allcodes));
        List<String> list2 = new ArrayList<String>(Arrays.asList(reservedcodes));
        list1.removeAll(list2);

        //again converting arraylists to arrays
        return list1.toArray(new String[list1.size()]);

    }

}
