package com.csi.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTimeAPIConcept {

	public static void main(String[] args) {

		System.out.println("\n Java 7 Date: " + new Date());

		System.out.println("\n Java 8 LocalDate: " + LocalDate.now().minusYears(2).getYear());

		System.out.println("\n Java 8 LocalDateTime: " + LocalDateTime.now());
	}

}
