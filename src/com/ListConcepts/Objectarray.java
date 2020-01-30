package com.ListConcepts;

public class Objectarray {
    //in static array type is of one type, to overcome this
    //object array ;  used to store different data types values

    public static void main(String[] args){
        Object ob[] = new Object[5];
        ob[0] = "waquar";
        ob[1] = 27;
        ob[2] = "delhi";
        ob[3] = "5.7";
        ob[4] = "Male";
        //System.out.println(ob.length);
        for (int i = 0; i < ob.length;  i++){
            System.out.println(ob[i]);
        }
    }

}
