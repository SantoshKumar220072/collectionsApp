package com.arraylist;

import java.util.ArrayList;

public class ArrayListEx6 {

	public static void main(String[] args) {
		
		Product p1=new Product("GamingConsole", 40560.90);
		Product p2=new Product("VaccumeCleaner", 50660.90);
		Product p3=new Product("AirPurifier", 30060.90);
		Product p4=new Product("AC", 30060.90);
		Product p5=new Product("Induction",1689);
		
		ArrayList<Product> a1=new ArrayList<Product>();
		a1.add(p1);
		a1.add(p2);
		
		
		ArrayList<Product> a2=new ArrayList<Product>();
		
		//a2.remove(p1);
		a2.addAll(a1);
		a2.add(p3);
		a2.add(p4);
		
		System.out.println(a1.contains(p1));//used to check that our collection containts that specified single element or not, if contains return true else return false
		System.out.println(a2.containsAll(a1));//returns true if all the elements of the specified collection contains or not
		//means we use this to check if one obj contains another object or nott
		for (Product product : a2) {
			System.out.println(product.pName+" "+product.pPrice);
			
		}

	}

}
