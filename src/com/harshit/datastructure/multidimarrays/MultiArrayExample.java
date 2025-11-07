package com.harshit.datastructure.multidimarrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrayExample {

	
	public static void main(String[] args) {
		// syntax datatyep[][] var_name = new int[size of row][size of col];
		int[][] mat = new int[3][3];
		int[][] mat1 = new int[5][];
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Matrix Element");
		for(int row = 0;row<mat.length;row++)
		{
			for(int col = 0;col<mat[row].length;col++)
			{
				mat[row][col] = sc.nextInt();
			}
			
			System.out.println();
		}
		
		for(int[] row:mat)
			System.out.println(Arrays.toString(row));
		System.out.println("==============================================");
		int[][] arr = {
				{9,8,8},
				{6,5},
				{3,2,1,6},
				{5}
		};
		int size = arr.length;
		for(int row = 0;row<size;row++)
		{
			for(int col = 0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
		for(int[] row : arr)
			System.out.println(Arrays.toString(row));
		
		}
	}
