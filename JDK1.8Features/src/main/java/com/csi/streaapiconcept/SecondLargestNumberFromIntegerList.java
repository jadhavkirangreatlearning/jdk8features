package com.csi.streaapiconcept;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumberFromIntegerList {

	public static void main(String[] args) {

		List<Integer> listIntegers = Arrays.asList(8, 9, 45, 34, 2, 5005, 7, 1001);

		int number = listIntegers.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed())
				.collect(Collectors.toList()).get(1);

		System.out.println(number);
	}

}
