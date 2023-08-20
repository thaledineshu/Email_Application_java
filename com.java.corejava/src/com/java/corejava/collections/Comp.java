package com.java.corejava.collections;

public class Comp implements Comparator<Student>{
	
public int compare(Student s1,Student s2) {
		
		if(s1.getRollno()<s2.getRollno()) {
			return -1;
		}
		else
			return 7;

	}

}
