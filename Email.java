package com.java.Email_application.email_app;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private int defualtPasswordLength=10;
	private String department;
	private String email;
	private String companySuffix="anycompany.com";
	private int mailBoxCapacity=15000;
	private String alternateEmail;
	
	
	//Constructor to receive the first name and lastname;
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		
		System.out.println("Email Created: "+this.firstName+" "+this.lastName);
		
		// call  a method asking for department
		this.department=setDepartment();
		
		System.out.println("Department: "+this.department);
		
		//call the method that generate random password
		this.password=randPassword(defualtPasswordLength);
		System.out.println("Your password is:"+this.password);
		
		// combine the elements to generate email
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("Your email is:"+this.email);
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("New Worker:"+firstName+"\nDepartment codes: \n1 for the sales\n2 for the development\n3 for the acconting\n0 for none\nEnter the department code:");
		
		
		Scanner in=new Scanner(System.in);
		
		int deptChoice=in.nextInt();

		if(deptChoice==1)
			return "sales";
		else if(deptChoice==2)
			return "dev";
		else if(deptChoice==3)
			return "account";
		else
			return "None";
	}
	
	//Generate the random password
	
	private String randPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password=new char[length];
		
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
//			System.out.println(rand);
//			System.out.println(passwordSet.charAt(rand));
			
		}
		return new String(password);
	}
	
	
	//set the mailbox capacity
	private void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity=capacity;
		
	}
	
	//set the alternate email
	
	private void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
		
	}
	
	//Change the password
	
	private void changePassword(String password) {
		this.password=password;
	}
	
	private int getMailboxCapacity() {
		return mailBoxCapacity;
	}
	private String getAlternateEmail() {
		return alternateEmail;
	}
	
	private String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Name:"+firstName+" "+lastName+" "+"\nCompanyEmail:"+email+"\nmailbox capacity:"+mailBoxCapacity+"mb";
	}

}
