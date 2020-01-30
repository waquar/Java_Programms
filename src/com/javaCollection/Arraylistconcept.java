package com.javaCollection;

import java.util.ArrayList;

public class Arraylistconcept {
	public static void main(String[] ars) {
		ArrayList<String> ar = new ArrayList<String>();
		//List<Integer> ari = new ArrayList<Integer>();
		ar.add("BMW");
		ar.add("DMW1");
		ar.add("CMW");
		ar.add("FMW2");
		ar.add("EMW");
		//ari.add(20,30);
		int size = ar.size();
	
		//iterating every items
		for (int i =0; i < ar.size(); i++) {
			System.out.print(ar.get(i)+ ",");
		}
		//for each loops
		for (String car : ar) {
			System.out.println("items are  "+ car);
		}
		ar.remove(size-3);
		System.out.println(ar);
		//System.out.println(ari);
		
	}

}
