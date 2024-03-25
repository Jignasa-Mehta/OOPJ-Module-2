package com.cdac;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		try {
			int result = num1 / num2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Enter valid number");
		}
	}
}
