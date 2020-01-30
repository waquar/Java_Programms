package mapInterface;

//it is a implementation of hash table.it is similar to hash map but ist is
//synchronized. it stores value on the basis of key and value.
// key -> (object)   _ hashcode(java object number) 32 bit signed integer number
// whenever we create an object java provides a unique integer number.
// but if two objects are equal(or clone) then the hashcodenum will also be same.
// internal implementation will be like <3425267728282 , "waquar">
//it is a thread safe. if one thread is accesing object others threads will be restricted.
//it is synchronized.
// value contain will always unique.
// no null key and value allowed (will throw null pointer exception) , but is allowed in hashmap.

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class Hashtableconcept {
    public static void main(String[] args){
        Hashtable h1 = new Hashtable();
        //putting value
        h1.put(1,"waquar");
        h1.put(2,"alam");
        h1.put(3,"ansari");
        //creating a clone or copy
        Hashtable h2 = new Hashtable();
        h2 = (Hashtable) h1.clone();
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h1.equals(h2));
        System.out.println("h1 hashcode" + h1.hashCode());
        System.out.println("h2 hashcode" + h2.hashCode());
        //clearing the value
        h2.clear();
        //contains value method
        Hashtable h3 = new Hashtable();
        h3.put("brand","apple");
        h3.put("type","iphone");
        h3.put("model","tenare");
        if (h3.contains("iphone")){
            System.out.println("true");
        }else{
            System.out.println("not found");
        }

        // using for loop (using enumerates)
        Enumeration e = h3.elements();
        System.out.println("Elements are :");
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        // using entryset
        Set s = h3.entrySet();
        System.out.println(s);

      //  s.add("lenovo finder");



    }

}
