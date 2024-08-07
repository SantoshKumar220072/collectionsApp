package com.arraylist;

import java.util.ArrayList;

//program to show the difference between retainsAll()&removeAll()

public class ArrayListEx7 {

	public static void main(String[] args) {
	
	Product p1=new Product("Books", 230.65);
	Product p2=new Product("watch", 2300.65);
		
	ArrayList<Product> al1=new ArrayList<Product>();
	al1.add(p1);
	al1.add(p2);
	
    for (Product product : al1) {
    	
    	System.out.println(product.pName+" "+product.pPrice);
		
	}
    
    ArrayList<Product> al3=new ArrayList<Product>();
    
    al3.addAll(al1);
    
    Product p3=new Product("Tablet",32650.98);
    Product p4=new Product("RiceCooker", 3200.86);
    al3.add(p3);
    al3.add(p4);
    

 
 
    
for (Product product : al3) {
	
	System.out.println(product.pName+" "+product.pPrice);
	
}
	
   al3.retainAll(al1);//it retains(keeps) only the specified collection here e.g-al1 removes the other one
    
    for (Product product : al3) {
    	
    	System.out.println(product.pName+" "+product.pPrice);
    	
		}
    
       //removeAll(p1) or removeAll(0)--not possible bcz it's used to remopve the entire collection not any specific element or obj
       al3.removeAll(al1);//no o/p bcz it removes all data of the specified collection here e.g-al1 
    	
	
	

}
}