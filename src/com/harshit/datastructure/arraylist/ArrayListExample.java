package com.harshit.datastructure.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListExample {

	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<>();
	    list.add(45);
	    list.add(90);
	    list.add(58);
	    list.add(-98);
	    list.add(0);
	    list.add(45);
	    System.out.println(list);
	    // get element at particular index;
	    System.out.println("print array list using for loop");
	    for(int i =0;i<list.size();i++)
	    {
	    	System.out.print(list.get(i)+" ");
	    }
	    System.out.println("\nprint array list using enhaced for loop/ for each loop");
	    
	    for(int ele:list)
	    	System.out.print(ele+" ");
	    System.out.println();
	    System.out.println(list.get(1));
	    System.out.println(list.remove(2));
	    System.out.println(list.set(3, 98));
	    System.out.println(list.contains(23));
	    System.out.println(list);
	    
	    List<String> employeeList = Arrays.asList("Harshit","Vikash","Gopal","Hari","Krishna","Radha");
	    System.out.println(employeeList);
	    Stream<String> streamList = employeeList.stream().filter((String name)->name.contains("vikash"));
	    long output = streamList.count();
	    System.out.println(output);
	    
	    // conversion of String array into list
	    String[] strArr = {"Harshit","Vikash","Gopal","Hari","Krishna","Radha"};
	    System.out.println(Arrays.toString(strArr));
	    List<String> list2 = Arrays.asList(strArr);
	    System.out.println(list2);
	    long output2 = list2.stream().filter((String ele)->ele.equalsIgnoreCase("krishna")).count();
	    System.out.println(output2);
	   
	    
	}
	
}
