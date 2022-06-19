package com.infyme.ListIteratorDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Course {
	String courseName;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String toString() {
		return courseName;
	}

}

public class ListIteratorDemo {
	public static void main(String args[]) {
		List<Course> a1 = new ArrayList<>();
		a1.add(new Course("Swapnith"));
		a1.add(new Course("Shreya"));
		a1.add(0, new Course("My Love"));
		a1.add(1, new Course("of my Life"));
		System.out.println("Details of Array List are : " + a1);
		System.out.println();

		ListIterator<Course> li = a1.listIterator();
		System.out.println("Using List Iterator to access the list");
		System.out.println();
		while (li.hasNext()) {
			Course c = li.next();
			System.out.println(c);

		}
		System.out.println();
		System.out.println("Using List Iterator to access the list backwards");
		System.out.println();
		while (li.hasPrevious()) {
			Course c = li.previous();
			System.out.println(c);
		}

	}

}
