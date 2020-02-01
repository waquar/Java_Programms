package com.javaCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;



//key value pair
//can repeat values but not keys. it will override the previous key.

public class Map_Concept {
	public static void main(String[] args) {
		
//doesnot maintain order
	Map <Integer, String> map = new HashMap<Integer, String>();
	map.put(1, "B");
	map.put(2, "A");
	map.put(3, "D");
	map.put(4, "C");
	map.put(4, "E");
	System.out.println("---Hash map----");
	System.out.println(map.get(4));
	
	for (Map.Entry<Integer, String> entry : map.entrySet()) {
		int key = entry.getKey();
		String value = entry.getValue();
		System.out.println(key + " - "  + value);
	}
	//one more way for running loop
	System.out.println("----");
	for (Integer key: map.keySet()) {
		String value = map.get(key);
		System.out.println("Key: " + key + ", value: " + value);
	}
	

	Map<Integer, String> linkedmap = new LinkedHashMap<Integer, String>();
	linkedmap.putAll(map);
	System.out.println("---Linked hash map----");
	System.out.println(linkedmap.get(2));
	
	for (Integer key : linkedmap.keySet()) {
		String value = linkedmap.get(key);
		System.out.println(key + ": " + value);
	
	}
	
	Map <Integer , String> treemap = new TreeMap<Integer, String>();
	treemap.putAll(linkedmap);
	treemap.put(5, "F");
	treemap.remove(3);
	System.out.println("---Tree map----");
	System.out.println(treemap.get(2));
	
	for (Map.Entry<Integer, String> entry : treemap.entrySet()) {
		int key = entry.getKey();
		String value = entry.getValue();
		System.out.println(key + ": " + value);
	}
	}

}
