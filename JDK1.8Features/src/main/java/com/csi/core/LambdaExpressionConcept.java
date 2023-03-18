package com.csi.core;

interface Employee {

	void get(int n1, int n2);
}

public class LambdaExpressionConcept {

	public static void main(String[] args) {

		Employee employee = (n1, n2) -> System.out.println(n1 * n2);

		employee.get(5, 6);
	}

}
