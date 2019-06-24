package com.bob.hms.admin.common.pract;

import java.util.*;

public class PersonTester {

	public static void main(String[] args) {
		List<String> personList = new ArrayList<>();
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Kiran", "MALE"));
		people.add(new Person("Preeti", "FEMALE"));
		people.add(new Person("Sneha", "FEMALE"));
		
		
		//Filtering patient  List based on Gender
		//Once Gender matches,  getting that person from List
		//and COnverting to UpperCase
		//and adding into List.
		people.stream()
				.filter(p -> p.getGender() == Gender.FEMALE.toString())
				.map(Person::getName)
				.map(String::toUpperCase)
				.forEach(name -> personList.add(name));
		
		System.out.println(personList);
				
	}

}
