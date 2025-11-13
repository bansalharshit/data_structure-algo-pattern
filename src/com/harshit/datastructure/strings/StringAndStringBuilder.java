package com.harshit.datastructure.strings;

import java.util.Arrays;

public class StringAndStringBuilder {

	public static void main(String[] args) {
		String a = "harshit";
		System.out.println(a.hashCode());
		String b = "harshit";
		System.out.println(b.hashCode());
		// here the object is create inside the String pool area / structure and string pool is specail memory area inside the 
		// heap memory area
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println("============================");
		String c = new String("vikahs");
		System.out.println(c.hashCode());
		String d = new String("vikahs");
		System.out.println(d.hashCode());
		// whenever string is create using new keyword it goes inside the heap not in string pool area 
		System.out.println(c==d); // here we are comparing reference whether they are point to the same location or not
		System.out.println(c.equals(d)); // here we are comparing the literals whether they are equal or not
		
		String name = null;
		System.out.println(name);
		
		String[] nameArray = new String[]{"Harshit","Vinay","Pooja","Neeta"};
		System.out.println(Arrays.toString(nameArray));
		
		System.out.println(3+"Kunal"+4);
		
		
	}
}
