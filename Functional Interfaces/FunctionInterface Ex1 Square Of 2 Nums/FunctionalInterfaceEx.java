package com.kiran.pract;

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		int x = 5;
		Square s = n->n*n;
		int ans = s.calculate(x);
		System.out.println(ans); //prints 25
	}
}
