package com.ctr;

public class ClientDetails {
	
	public ClientDetails() {
		System.out.println("I am constructor");
		
	}
	public ClientDetails(String name) {
		System.out.println("My name is "+name);
		
	}
	public ClientDetails(int id,long phone) {
		System.out.println("id is"+id 	+  "phone is "+phone);
	}
public static void main(String[] args) {
	ClientDetails c = new ClientDetails();
	ClientDetails c1 = new ClientDetails("divya");
	ClientDetails c3 = new ClientDetails(12,16785778);
	
}
}
