package com.harshit.datastructure.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// syntax 
		// datatype[] arrayName = new datatype[size];
		int[] arr = new int[5];
		System.out.println(Arrays.toString(arr));
		
		String[] strArray = new String[5];
		System.out.println(Arrays.toString(strArray));
		
		int[] arr1 = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr1));
		
		// how to take input 
		System.out.println("Enter the input for array of size 5");
		Scanner sc = new Scanner(System.in);
		int[] arr2 = new  int[5];
		for(int i =0;i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		for(int ele:arr2)
			System.out.println(Arrays.toString(arr2));
		
	}
	
}
