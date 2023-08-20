package com.java.corejava.collectio F
//import java.util.Queue;
import java.util.PriorityQueue;

public class QueueMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueCollection book1=new QueueCollection(101,"History","abc","pune",1001);
		QueueCollection book2=new QueueCollection(102,"Math","unkown","pune",2000);
		QueueCollection book3= new QueueCollection(103,"Science","Unkown","pune",700);
		
		PriorityQueue<QueueCollection> q=new PriorityQueue<QueueCollection>();
		q.add(book1);
		q.add(book2);
		q.add(book3);
//	System.out.println(q);
		
		for(Object o:q) {
			System.out.println(o);
		}
		
		for(QueueCollection a:q) {
			System.out.println(a.getId());
		}
		
		q.remove(book1);
		
		for(Object o:q) {
			System.out.println(o);
		}
		
		
		
		
		
	}

}
