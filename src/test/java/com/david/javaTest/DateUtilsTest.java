package com.david.javaTest;

import hirondelle.date4j.DateTime;

import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void dateUtils() {
		DateTime dateOnly = DateTime.forDateOnly(2010,01,19);
		System.out.println(dateOnly);
		throw new IllegalArgumentException("wrong");
		// System.out.println("Unreachable code");
	}


}
