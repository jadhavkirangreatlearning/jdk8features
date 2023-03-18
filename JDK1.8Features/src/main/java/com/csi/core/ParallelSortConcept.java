package com.csi.core;

import java.util.Arrays;

public class ParallelSortConcept {

	public static void main(String[] args) {

		int arr[] = { 8, 9, 45, 34, 2, 7, 1001 };

		System.out.println("\n Before Sort: ");

		for (int i : arr) {
			System.out.println(i);
		}

		Arrays.parallelSort(arr);
		System.out.println("\n After Sort: ");

		for (int i : arr) {
			System.out.println(i);
		}
	}

}
