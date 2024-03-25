package com.cdac;

public class Array {
	public static void main(String[] args) {
		int[] arr = new int[] { 19,21,23,11,10};
		int max=arr[0];
		int min=arr[0];
		for (int i=1;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
			System.out.println("Maximum Number is: "+max);
			System.out.println("Minimum Number is: "+min);
	}
}
