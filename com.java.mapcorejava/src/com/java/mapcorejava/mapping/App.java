package com.java.mapcorejava.mapping;



import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
public class App implements Comparator<Fruit>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit f1=new Fruit("Mango","yellow","oval","sweat",1200);
		Fruit f2=new Fruit("Apple","red","shperical","Sweat",500);
		
		Fruit f3=new Fruit("Orange","Red","Spherical","sweat",300);
		Fruit f4=new Fruit("Kiwi","Brown","Oval","Sweet",700);
		
		
		HashMap hm=new HashMap();
//		System.out.println(f1);
//		System.out.println(f2);
//		System.out.println(f3);
//		System.out.println(f4);
		hm.put(1,f1);
		hm.put(2,f2);
		hm.put(3,f3);
		hm.put(4,f4);
//		
		System.out.println(hm);
//		for(Fruit f: Fruit) {
//			System.out.println(f);
//		}
		
		TreeMap tm=new TreeMap();
		
		tm.put(11, f1);
		tm.put(12,f2);
		tm.put(13,f3);
		tm.put(14,f4);
		
		System.out.println(tm);
		
		//tm.clear();
		
		System.out.println(tm);
		
		TreeMap t=new TreeMap();
		t=(TreeMap)tm.clone();
		

	}

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
