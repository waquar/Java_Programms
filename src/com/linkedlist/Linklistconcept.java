package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linklistconcept {
    public static void main(String[] args){
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("waquar");
        l1.add("alam");
        l1.add("ansari");
        l1.add("526");
        System.out.println(l1);
        l1.addFirst("myname");  //it will be the head
        l1.add("is");
        l1.addLast("Thatsall!"); //it will be last node
        System.out.println(l1);
        System.out.println(l1.get(0));
        l1.set(0,"mynameis");         //it will put this in 0 position.
        System.out.println(l1);
        l1.remove("is");
        System.out.println(l1);
        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1);
        System.out.println("______________");

        //iteration of linkedlist
        for(int i = 0; i <l1.size(); i++ ){
           // System.out.println(l1.get(i));
        }
        //advanced for loop (for each loop)
        for(String s : l1){
           // System.out.println(s);
        }
        //using iterator    iterator supports only while loop
        Iterator<String> i = l1.iterator();
        while(i.hasNext()){
            //System.out.println(i.next());
        }
        //while loop
        int num = 0;
        while (l1.size() > num){
            System.out.println(l1.get(num));
            num++;
        }

    }

}
