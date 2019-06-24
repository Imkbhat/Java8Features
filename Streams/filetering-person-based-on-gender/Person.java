package com.bob.hms.admin.common.pract;

public class Person {
	
	private String gender;
	private String name;
	
	public Person(String name,  String gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
