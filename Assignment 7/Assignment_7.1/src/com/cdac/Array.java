package com.cdac;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6};
		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6 };
		if (Arrays.equals(arr1, arr2))
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
	}
}
