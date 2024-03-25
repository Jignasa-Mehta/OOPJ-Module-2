package com.cdac;

public class Array {
	public static void main(String[] args) {
		int arr[] = new int[] { 24, 54, 31, 16, 82, 45, 67 };
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstLargest) {
				thirdLargest = secondLargest;
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] > secondLargest) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			} else if (arr[i] > thirdLargest) {
				thirdLargest = arr[i];
			}
		}
		System.out.println(thirdLargest);
	}
}
