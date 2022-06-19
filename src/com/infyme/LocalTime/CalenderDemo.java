package com.infyme.LocalTime;

import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();// Create Calendar
		System.out.println("Current Date is\t:" + cal.getTime() + "\n");// print current date
		cal.set(1992, 0, 1);// set the date to 1st Jan,1992 YYYY,MM,DD
		System.out.println("Date after 1st modification\t:" + cal.getTime() + "\n");
		cal.add(Calendar.MONTH, 3);// add 3 months
		System.out.println("Date after adding 3 months\t:" + cal.getTime() + "\n");
		cal.add(Calendar.YEAR, -3);// subtract 3 years
		System.out.println("Date after subtracting 3 years\t:" + cal.getTime() + "\n");

	}
}

// Other fields and method
