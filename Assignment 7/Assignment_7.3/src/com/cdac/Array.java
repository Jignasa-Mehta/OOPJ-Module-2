package com.cdac;

public class Array {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6};
		int t=0,n=arr.length;
		for (int i=0;i<n/2;i++) {
			t=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=t;
		}
		for(int j=0;j<n;j++)
			System.out.print(arr[j]+" ");
	}
}
