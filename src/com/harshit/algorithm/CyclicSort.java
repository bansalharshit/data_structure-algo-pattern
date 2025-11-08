package com.harshit.algorithm;

import java.util.Arrays;

// hint to identify : when you have given a continuous range either [0,n] or [1,n] 
// make sure range should be continuous 
// here is n is no of element 
public class CyclicSort {

	public static void main(String[] args) {
		int[] arr = {5,3,2,1,4};
		sortArray(arr);
	}

	private static void sortArray(int[] arr) {
		// TODO Auto-generated method stub
		int i =0;
		while(i<arr.length)
		{
			int correctIndex = arr[i]-1;
			if(arr[i]!=arr[correctIndex])
				swap(arr,i,correctIndex);
			else
				i++;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int first, int second) {
		// TODO Auto-generated method stub
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		
	}
	
}
