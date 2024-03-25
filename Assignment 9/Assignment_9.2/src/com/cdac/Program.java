package com.cdac;


public class Program {
	private int num1;
	
	
	public void setNumber(int num1) throws Exception {
		if (num1%2!=0)
			throw new Exception();
		this.num1=num1;
		
	}
	
	public static void main(String[] args) {
		Program p=new Program();
		try {
			p.setNumber(21);
		} catch (Exception e) {
			System.out.println("Enter Even Number");
		}
		
	}	
}
