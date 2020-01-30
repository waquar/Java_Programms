package com.javaCollection;

import java.util.LinkedList;
import java.util.List;

/***
 * Array List - {0, 1, 2, 3, 4, 5, 6}
 * Linked List - [0] > [1] > [2]
 *                   <     < 
 * Array List - When you have to add at the end and remove from the end and getting is fast
 * Linked List - When you have add at the beginning and remove from the beginning
 */

public class Linkedlist_Concept {
	public static void main(String[] ars) {
		List<String> ar = new LinkedList<String>();
		//List<Integer> ari = new ArrayList<Integer>();
		ar.add("Audi");
		ar.add("BMW");
		ar.add("Lexus");
		ar.add("Maclaren");
		ar.add("Buggati");
		//ari.add(20,30);
		int size = ar.size();
		//iterating every items
		for (int i =0; i < ar.size(); i++) {
			System.out.print(ar.get(i)+ ",");
		}
		//for each loops
		for (String car : ar) {
			System.out.println();
			System.out.println("items are  "+ car);
		}
		ar.remove(size-3);
		System.out.println(ar);
		//System.out.println(ari);
		
	}

}

