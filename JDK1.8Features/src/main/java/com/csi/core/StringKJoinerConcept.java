package com.csi.core;

import java.util.StringJoiner;

public class StringKJoinerConcept {
	
	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(" & ");
		
		joiner.add("TCS");
		joiner.add("INFOSYS");
		joiner.add("WIPRO");
		
		System.out.println(joiner);
	}

}
