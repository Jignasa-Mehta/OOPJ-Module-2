package com.cdac;

public class Array {
	public static void main(String[] args) {
		
		int arr[] = new int[] { 65,14,129,34,7 };
		int arrayOrder=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				if(arrayOrder==1) { arrayOrder=0; break; }
				else arrayOrder=-1;
			}
				
			else if(arr[i]<arr[i+1]) {
				if(arrayOrder==-1) { arrayOrder=0; break;}
				else arrayOrder=1;
			}
			
		}
		if(arrayOrder==1)
		System.out.println("Ascending");
		else if(arrayOrder==-1)
			System.out.println("Descending");
		else 
			System.out.println("Random");
	}
}
