package com.csi.core;

import java.util.Optional;

public class OptionalClassConcept {

	public static void main(String[] args) {

		String companyName = null;

		Optional<String> cName = Optional.ofNullable(companyName);

		if (cName.isPresent()) {
			System.out.println(companyName.length());
		} else {
			System.out.println("Company Name is NULL");
		}
	}

}
