package com.cdac;

public class Array {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };
		int num = 6;

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] + arr[j] == num)
					System.out.println(arr[i] + " + " + arr[j] + " = " + num);
			}
		}
	}
}
