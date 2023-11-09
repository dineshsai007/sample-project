package org.setinterface;

import java.util.HashSet;

public class EmployeeManagement {

	public static void main(String[] args) {
		//create
		HashSet<Integer> empIds = new HashSet<Integer>();
		//using parent class we can instantiate child class like set parent class -> child class LinkedHashset
		// you can also use LinkedHashSet, TreeSet , Just Set also
		//employee
		empIds.add(12105);
		empIds.add(12102);
		empIds.add(12103);
		empIds.add(12101);
		empIds.add(12103);
		
		System.out.println("Employee in company with unique "+empIds);
	}

}
