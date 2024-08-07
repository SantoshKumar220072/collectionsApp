package com.arraylist;

import java.util.ArrayList;


public class ArrayListEx2 {

	public static void main(String[] args)throws ClassCastException  {
	
		//This is not typesafe operation 
		ArrayList al=new ArrayList();
		al.add(new Product("SmartPhones", 25250.89));
		al.add(new Order(2141424, "RetailNet"));
		al.add(null);
		
		for (Object o : al) {
			
			if(o instanceof Product) {
				Product p = (Product)o;
				System.out.println(p.pName+" "+p.pPrice);
				}
			}
		for (Object o : al) {
			if (o instanceof Order) {
				Order or = (Order)o;
				System.out.println(or.oId+" "+or.seller);
				
			}
			
		}
		
		for (Object o : al) {
			
			if(o==null) {
				System.out.println(o);
			}
			
		}
		
		/*Product p2=(Product)al.get(1);
			System.out.println(p2.pName+""+p2.pPrice);*/
			
			
		//Generics(jdk1.5)helps collection to perform typeSafe Operation
		ArrayList<Product> p1=new ArrayList<Product>();
		p1.add(new Product("Refrigrator", 45679.90));
		p1.add(new Product("Grinder", 4500.79));
		
		ArrayList<Order> o=new ArrayList<Order>();
		o.add(new Order(76255,"CloudRetail"));
		o.add(new Order(6985974, "RetailNet"));
		
		
	for (Order order : o) {
		System.out.println(order.oId+" "+order.seller);
		
	}
	
	for (Product product : p1) {
		
		System.out.println(product.pName+" "+product.pPrice);
		
		}
	
Product p=	p1.get(1);
System.out.println(p.pName+" "+p.pPrice);

Order o1=o.get(0);
System.out.println(o1.oId+" "+p.pName);

	}
}
