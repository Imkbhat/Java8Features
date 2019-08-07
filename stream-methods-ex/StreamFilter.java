package com.kiran.java8.venkat;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		
		
		//Intermediate Operations:
		//Using Filter : The filter method is used to select elements as per the Predicate passed as argument
		
		List<String> names = Arrays.asList("Kiran", "Bhat", "Engineer");
		List<String> containNames = names
				.stream()
				.filter(s->s.startsWith("K"))
				.collect(Collectors.toList());
		
		System.out.println(containNames);
		
		//========================================================
		//Using Map: The map method is used to map the items in the collection to other objects according 
		//to the Predicate passed as argument
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 6, 8, 10);
		List<Integer> containNums = nums
				.stream()
				.map(s->s*s)
				.collect(Collectors.toList());
		
		System.out.println(containNums);
		
		//=========================================================
		//Using Sorted: The sorted method is used to sort the stream.
		
		List<String> sortedNames =
				names.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedNames);
	
	  //==============================================================
	  //Terminal Operations:
	  // Using  collect : The collect method is used to return the result of the intermediate operations performed on the stream
		Set squares = nums.stream().map(x->x*x).collect(Collectors.toSet());
		
		System.out.println(squares);
	
		
	 //=================================================================
	 //Using reduce: The reduce method is used to reduce the elements of a stream to a single value.
	  
	 int evan = nums.stream().filter(x -> x%2 == 0).reduce(0,(ans,i) -> ans+i);
	 System.out.println(evan);
		
	//===================================================================
	//forEach : The forEach method is used to iterate through every element of the stream.
	 nums.stream().forEach(System.out::print);
	}

}
