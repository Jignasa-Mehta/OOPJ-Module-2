package com.cdac;


public class Program {
	private static int num1;
	private static int num2;
	
	
	public static void showData(){
		num1=10;
		num2=0;
	
		try {
			int result=num1/num2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Inside Arithmatic Exception block");
			System.out.println("Enter Valid Integer Number");	
		}
		catch (RuntimeException e) {
			System.out.println("Enter Valid Integer Number");	
		}
		catch (Exception e) {
			System.out.println("Enter Valid Integer Number");	
		}
		
	}
	
	public static void main(String[] args) {
		Program.showData();
		
		
		
	}	
}
