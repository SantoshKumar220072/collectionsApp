package com.arraylist;

import java.util.ArrayList;

//Program to show difference between contains()&containsAll()

public class ArrayListEx8 {

	public static void main(String[] args) {
	
	Order o1=new Order(575678,"AmazonRetail");
	Order o2=new Order(537651,"SamsungIndia");
	Order o3=new Order(9775685,"LGIndia");
	Order o4=new Order(979569, "TriBit");
	
	ArrayList<Order> al1=new ArrayList<Order>();
	al1.add(o1);
	al1.add(o2);
	//al1.remove(o1);
	System.out.println(al1.contains(o1));//true or false if we do al1.remove(o1)
	
	for (Order order : al1) {
		System.out.println(order.oId+" "+order.seller);
		
	}
	
	ArrayList<Order> al2=new ArrayList<>(al1);
	al2.add(o3);
	al2.add(o4);
	for (Order order : al2) {
		System.out.println(order.oId+" "+order.seller);
		
	}
	
	//contains() returns true if the specifed element or obj ,our collection(al2) contains else returns false
	System.out.println(al2.contains(o1));//true & //false if we remove it from al1
	//containsAll() returns true if our collection(al2) contains all the elements or objs of the specified collection(al1) else returns false
	System.out.println(al2.containsAll(al1));//true
	
	//to remove o1 obj from al2
	al2.remove(o1);
	//al2.remove(0);// we can use index value also to remove o1 which has 0 index value
	System.out.println(al2.contains(o1));//false 
	System.out.println(al2.containsAll(al1));//false
	
	
	
	
	}

}
