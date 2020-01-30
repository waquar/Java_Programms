package com.javaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Not allowed duplicate value.


public class Set_Concept {
	public static void main(String[] args) {
		
//No order
		Set<String> set = new HashSet<String>();
		set.add("BMW");	
		set.add("BMW");
		set.add("Audi");
		set.add("Lexus");
		//System.out.println(set);
		for (String s : set) {
			System.out.println(s);
		}
		
		System.out.println("---------");
		
// Will print according to when you added.
		Set<String> linkedhashset = new LinkedHashSet<String>();
		linkedhashset.add("BMW");	
		linkedhashset.add("BMW");
		linkedhashset.add("Audi");
		linkedhashset.add("Lexus");
		//System.out.println(set);
		for (String s1 : linkedhashset) {
			System.out.println(s1);
		}
		
		System.out.println("---------");
		
// Will print according to alphebetical order or arithmetic order.
				Set<String> treeset = new TreeSet<String>();
				treeset.add("BMW");	
				treeset.add("BMW");
				treeset.add("Audi");
				treeset.add("Lexus");
				//System.out.println(set);
				for (String s2 : treeset) {
					System.out.println(s2);
				}
		
	}

}
