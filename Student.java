package org.setinterface;
//Student Class implementing Comparable
public class Student implements Comparable<Student>{
	private int id;
	private String name;
	
	//constructor
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}
	//getter method
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Student{"+
				"id ="+id+
				",Name= "+name+
				'}';
	}
	@Override
	public int compareTo(Student otherStudent) {
		return Integer.compare(this.id, otherStudent.id);
	}
	
}
