package com.cdac;

public class Array {
	public static void main(String[] args) {
		int arr1[]=new int[]{23,60,94,3,102};
		int arr2[]=new int[] {42,16,74};
		int i=0;
		for(;i<arr1.length && i<arr2.length;i++) {
			System.out.print(arr1[i]+" "+arr2[i]+" ");
		}
		if (arr1.length>arr2.length) {
			while (i<arr1.length) {
				System.out.print(arr1[i]+" ");
				i++;
			}
		}
		else {
			while (i<arr2.length) {
				System.out.print(arr2[i]+" ");
				i++;
			}
		}	
	}
}
