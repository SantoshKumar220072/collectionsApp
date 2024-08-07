package com.arraylist;

import java.util.ArrayList;

public class ArrayLListEx5 {

	public static void main(String[] args) {
	
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Santosh");
		a1.add("10");
		a1.add("10.5");
		
		//adding one collection to another collection using constructor
		ArrayList<String> a2=new ArrayList<String>(a1);
		a2.add("Manish");
		a2.add("55");
		a2.add("43.4");
		
		System.out.println(a2);
		
		//using addAll();
		
		ArrayList<String> a3=new ArrayList<String>();
		a3.addAll(a2);
		a3.add("Sushant");
		a3.add("Rajat");
		
		System.out.println(a3);
		
		}

}
