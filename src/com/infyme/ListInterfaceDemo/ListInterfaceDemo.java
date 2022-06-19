package com.infyme.ListInterfaceDemo;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

class Course {
	String courseName;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String toString() {
		return courseName;
	}
}

 class ListInterfaceDemo{
	public static void main(String[] args) {
		List<Course> cl = new LinkedList<>();
		cl.add(new Course("Java"));
		cl.add(new Course("Hibernate"));
		cl.add(new Course("AngularJS"));

		// Accessing the list of courses Using Iterator
		Iterator<Course> ci = cl.iterator();
		System.out.println("Using Iterator to access the list of courses");
		System.out.println();
		
		while (ci.hasNext()) {
			Course c = ci.next();
			System.out.println(c); // toString() method has been overridden in the Course class
		}

		// Accessing the list of courses Using for loop
		System.out.println();
		System.out.println("Using for loop to access the list of courses");
		System.out.println();
		
		for (int i = 0; i < cl.size(); i++) {
			System.out.println(cl.get(i));
		}

		// Accessing the list of courses Using enhanced for loop (for-each)
		System.out.println();
		System.out.println("Using enhanced for loop to access the list of courses");
		System.out.println();
		
		for (Course c : cl) { // Can be read as: for each Course c in cl
			System.out.println(c);
		}
	}
}