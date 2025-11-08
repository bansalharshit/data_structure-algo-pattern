package com.harshit.datastructure.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
private static int[] reverseFunc(int[] arr)
	{
	// using two pointers approach 
		int start = 0;
		int end = arr.length -1;
		while(start<end)
		{
			swapFunc(arr,start,end);
			start++;
			end--;
		}
		return arr;
	}
private static void swapFunc(int[] arr,int start,int end)
{
	int temp = arr[start];
	arr[start] = arr[end];
	arr[end] = temp;
}
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of arr");
	int size = sc.nextInt();
	int[] arr = new int[size];
	System.out.println("Enter the Element of array");
	for(int i =0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("Array before Reverse : "+ Arrays.toString(arr));
	int[] output = reverseFunc(arr);
	System.out.println("Array After Reverse : "+ Arrays.toString(arr));
	for(int ele:output)
		System.out.print(ele + " ");
	sc.close(); // it is always advisable to close scanner to avoid memory leak 
}

}
