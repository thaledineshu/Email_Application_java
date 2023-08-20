package com.java.corejava.collections;


public class QueueCollection implements Comparable<QueueCollection>{
	
	//this is books collection
	private int id;
	String name;
	String author;
	String publication;
	int pages;
	
	public QueueCollection () {
		
	}
	
	public QueueCollection(int id,String name,String author,String publication,int pages){
		super();
		this.id=id;
		this.name=name;
		this.author=author;
		this.publication=publication;
		this.pages=pages;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "QueueCollection [id=" + id + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", pages=" + pages + "]";
	}


	@Override
	public int compareTo(QueueCollection o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
