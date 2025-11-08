package com.harshit.datastructure.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class multiArrayList {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// Make MutlitDimensional List
	ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	
	// before taking input for element first initialize the multi list 
	// if we don't initialize the list before taking input it gives us error as list was null initially and try are try to perform get operation on it
	for(int i =0;i<3;i++)
	{
		list.add(new ArrayList<>());
	}
	
	// now taking input 
	System.out.println("enter the elements \n");
	for(int i =0;i<3;i++)
	{
		for( int j =0;j<3;j++)
		{
			list.get(i).add(sc.nextInt());
		}
	}
	
  sc.close();
  System.out.println("================");
  printMulitListByForEach(list);
  printMultiListByForLoop(list);
	System.out.println(list);
	
}
static void printMultiListByForLoop(ArrayList<ArrayList<Integer>> list)
{
	System.out.println("Using traditional for loop");
	for(int i =0;i<list.size();i++)
	{
		
		for( int j =0;j<list.get(i).size();j++)
		{
			System.out.print(list.get(i).get(j)+" ");
		}
		System.out.println();
	}
}
private static void printMulitListByForEach(ArrayList<ArrayList<Integer>> list) {
	
	System.out.println("Using Enhanced For Loop");
	for(ArrayList<Integer> row : list)
	{
		for(Integer ele : row)
		{
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	
}
}
