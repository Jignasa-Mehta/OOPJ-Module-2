package com.cdac;

public class Array {
	public static void main(String[] args) {
		int arr[] = new int[] { 5,14,35,89,140 };
		int average=0;
		if (arr.length<3)
			return;
		for (int i = 0; i < arr.length-2; i++) {
			average=(arr[i]+arr[i+1]+arr[i+2])/3;
			System.out.print(average+" ");
		}
	}
}
