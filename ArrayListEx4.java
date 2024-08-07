package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx4 {

	public static void main(String[] args) {
		
	//to create duplicate objects without for loop
		
		ArrayList<String> al=new ArrayList<String>(Collections.nCopies(10, "Hari"));
		
		System.out.println(al);
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Manish");
		al1.add("Shreyas");
		al1.add("Rajat");
		al1.add("Prashant");
		al1.add("Gautam");
		
		System.out.println("Before Swapping: "+al1);
		
		Collections.swap(al1, 2, 4);
		System.out.println("After Swapping: "+al1);

	}

}
