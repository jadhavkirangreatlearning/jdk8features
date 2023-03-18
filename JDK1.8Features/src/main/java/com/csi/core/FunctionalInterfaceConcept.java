package com.csi.core;

import java.util.Comparator;

@FunctionalInterface // SAM
interface Product {

	void get();

	static void set() {

	}

	static void show() {

	}

	default void net() {

	}
	
	default void showData() {
		
	}

}

public class FunctionalInterfaceConcept {

	public static void main(String[] args) {

		Product product = () -> System.out.println("DONE");

		product.get();
	}

}
