package com.ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylists {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = new int[3];     //this is a static array. size is fixed.
//                                  to overcome this we use dynamic array:-array list
//		a[0] = 9;
//		a[1] = 1;
//		a[2] = 2;
//		//a[3] = 5;  //Array out of bound index.
//		
//		System.out.println(a.length);
		
//		ArrayList ar = new ArrayList();
//		ar.add(10);
//		ar.add("waq");
//		ar.add(50);
//
//		System.out.println(ar.get(1));
//		System.out.println(ar.size());
		
		//Non generic and generics : means specifing the data type
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(34);
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("waquar");
		ArrayList<Boolean> ar3 = new ArrayList<Boolean>();
		ar3.add(true);

		Employee e1 = new Employee("waquar",27,"dev");
		Employee e2 = new Employee("alam",27,"dev");
		Employee e3 = new Employee("ansari",27,"dev");


		//we are creating array list
		// example of userdefined class object of array list.
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		//using iterator to iterate the values.
		Iterator<Employee> il = al.iterator();
		while (il.hasNext()){
			Employee e4 = il.next();
			System.out.println(e4.name);
			System.out.println(e4.age);
			System.out.println(e4.dept);
		}

		//addall()   to merge in arraylist
		System.out.println("*****************************");
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("waquar");
		ar5.add("ala");
		ar5.add("ansari");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("waq");
		ar6.add("ala");
		ar6.add("ans");

		ar5.addAll(ar6);

		for (int i = 0 ; i<ar5.size(); i++){
			System.out.println(ar5.get(i));
		}

		System.out.println("***************");

		//retainall. //checking common part.reatinall
		ar5.retainAll(ar6);
		for (int i = 0 ; i<ar5.size(); i++){
			System.out.println(ar5.get(i));
		}

		System.out.println("***************");



		//remove all
		ar5.removeAll(ar6);
		for (int i = 0 ; i<ar5.size(); i++){
			System.out.println(ar5.get(i));
		}
		System.out.println("**********");


	}

}
