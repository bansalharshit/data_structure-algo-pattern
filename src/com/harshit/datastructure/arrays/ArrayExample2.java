package com.harshit.datastructure.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of Array");
	int size = sc.nextInt();
	int[] arr = new int[size];
	
	for(int i = 0;i<size;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println(Arrays.toString(arr));
	change(arr);
	System.out.println("after modify the array");
	for(int ele : arr)
		System.out.print(ele+ " ");
}
static void change(int[] arr1)
{
	arr1[0] = 45;
}
}
