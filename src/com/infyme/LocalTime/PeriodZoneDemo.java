package com.infyme.LocalTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class PeriodZoneDemo {
	public static void main(String[] args) {
		// ZonedDateTime is used to change the time according to zones
		System.out.println("***** ZonedDateTime ******");
		System.out.println(" ZonedDateTime Now: " + ZonedDateTime.now());
		System.out.println(" ZonedDateTime Europe: " + ZonedDateTime.now(ZoneId.of("Europe/Athens")));

		// Period
		System.out.println();
		System.out.println("*****  Period *****");
		LocalDate present = LocalDate.now();
		System.out.println("Today's date: " + present);
		LocalDate later = present.plusDays(3);
		System.out.println("Later date: " + later);
		Period period = Period.between(present, later);
		int lops = period.getDays();
		System.out.println("Difference in days: " + lops);

		// ChronoUnit
		System.out.println();
		System.out.println("*****  ChronoUnit  *****");
		LocalDate today = LocalDate.now();
		System.out.println("Today's date: " + today);
		LocalDate after = today.plus(1, ChronoUnit.MONTHS);// (No of month,ChronoUnit.MONTH)
		LocalDate afteryear = today.plus(1, ChronoUnit.YEARS); // (No of year,ChronoUnit.YEARS)
		System.out.println("Date after 1 month: " + after);
		System.out.println("Date after 1 year: " + afteryear);

		// DateTimeFormatter
		System.out.println();
		System.out.println("*****  DateTimeFormatter  *****");
		LocalDate paySlipDate = LocalDate.now();
		System.out.println("Current Date : " + paySlipDate); // Output: Current Date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println("After using Date-Time Formatter : " + paySlipDate.format(formatter));
		// Output: Current
		// Date

	}
}