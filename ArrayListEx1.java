package com.arraylist;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList objs=new ArrayList();
		objs.add("Santosh");
		objs.add(10);
		objs.add(null);
		objs.add(10);
		objs.add(22.7);
		
		System.out.println(objs);//internally calls toString method of wrapper class which overridden such a way that  it will return data

		System.out.println(objs.toString());//it will give same o/p as previous

		boolean flag=true;
		System.out.println("----------------------------------");
		

		
	}

}
