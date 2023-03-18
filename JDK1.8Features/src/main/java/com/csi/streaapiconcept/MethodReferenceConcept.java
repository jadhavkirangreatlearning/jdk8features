package com.csi.streaapiconcept;

interface Customer {

	void get();

}

public class MethodReferenceConcept {

	public static void set() {
		System.out.println("CSI PUNE");
	}

	public static void main(String[] args) {

		Customer customer = MethodReferenceConcept::set;

		customer.get();
	}

}
