package com.java.corejava.encapsulation;

public class Student {
	
	private int id;
	private String name;
	private String city;
	static Student s1=new Student();
	public Student(){//put sum parameters into the constructor to make it parameterized constructor
		super();
	}
		public Student(int id,String name,String city) {
			this.id=id;
			this.name=name;
			this.city=city;
		}
		// TODO Auto-generated constructor stub
	

	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	public String getCity() {
		return city;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1.getId();
		System.out.println(s1.getId());
	}

}
