package mapInterface;


//Hashmap is a class which implements map interface,
// and it extends abstarct map
//it contains only unique elements
//it stores value in key and value pair.
//it may have one null key and multiple null values.
//it maintains no order
//hashmaps are non-synchronized(one by one), means if it is used in multithreading .(Improve the performance)
//concurrent modification exception - fail,fast condition(when one thread is adding but same
// time other thread is removing.)
// if you will remove key it will not shift the key.

import com.ListConcepts.Employee;

import java.util.HashMap;
import java.util.Map;


public class Hashmapconcept {
    public static void main(String[] args){
        HashMap <Integer, String> h1= new HashMap<Integer, String>();
        h1.put(1, "waquar");
        h1.put(2, "alam");
        h1.put(3, "ansari");
        System.out.println(h1.get(1));
        System.out.println(h1.get(9));

        //using for loop for getting value
        for(Map.Entry m : h1.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }
        // removing entry
        h1.remove(3);
        for(Map.Entry m : h1.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }
        System.out.println(h1);

        HashMap<Integer, Employee> hmapemp = new HashMap<Integer, Employee>();

        Employee e1 = new Employee("waquar", 26, "devlop");
        Employee e2 = new Employee("alam", 27, "devlo");
        Employee e3 = new Employee("ansari", 28, "devl");
        hmapemp.put(1, e1);
        hmapemp.put(2, e2);
        hmapemp.put(3, e3);


        //traversing the hashmap  we are using entry set
        for(Map.Entry<Integer, Employee> em : hmapemp.entrySet()){
            int key = em.getKey();
            Employee e = em.getValue();
            System.out.println(key);
            System.out.println();



        }

    }
}
