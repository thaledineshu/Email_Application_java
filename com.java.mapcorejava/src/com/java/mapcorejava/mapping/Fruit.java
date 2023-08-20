package com.java.mapcorejava.mapping;

public class Fruit implements Comparator<Fruit>{
	
	String name;
	String color;
	String shape;
	String taste;
	int price;
	
		
	public Fruit(String name,String color,String shape,String taste,int price) {
		this.name=name;
		this.color=color;
		this.shape=shape;
		this.taste=taste;
		this.price=price;
	}
	
	
	public void setname(String name) {
			this.name=name;
		}
	public void setColor(String color) {
		this.color=color;
	}
	public void setShape(String shape) {
		this.shape=shape;
	}
	
	public void setTaste(String taste) {
		this.taste=taste;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getShape()
	{
		return shape;
	}
	
	public String getTaste()
	{
		return taste;
	}
	public int getPrice()
	{
		return price;
	}

}
