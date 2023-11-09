package org.setinterface;

import java.util.TreeSet;

public class StudentDetail {

	public static void main(String[] args) {
		// create an object of TreeSet
		TreeSet<Student> std = new TreeSet<Student>();
		std.add(new Student(101, "Lavish"));
		std.add(new Student(254, "Suresh"));
		std.add(new Student(101, "Lavish"));// duplicate data
		std.add(new Student(105, "Dinesh"));
		std.add(new Student(109, "Sumith"));

		// create a student reference
		Student stdcheck = new Student(109, "Sumith");
		if (std.contains(stdcheck)) {
			System.out.println("Student Available with name " + stdcheck.getName());
			;
		} else {
			System.out.println("Stuent is not availble with name " + stdcheck.getName());
		}
		//print details using for loop
		for (Student student : std) {
			System.out.println(student);
		}
		
		
	}

}
