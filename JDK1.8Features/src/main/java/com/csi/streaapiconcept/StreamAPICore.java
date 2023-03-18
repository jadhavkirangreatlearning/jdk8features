package com.csi.streaapiconcept;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
	private int empId;

	private String empName;

	private String empAddress;

	private int empAge;

	private double empSalary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, String empAddress, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empAge=" + empAge
				+ ", empSalary=" + empSalary + "]";
	}

}

public class StreamAPICore {

	public static void main(String[] args) {

		/*
		 * Stream.of(new Employee(121, "SWARA", "PUNE", 22, 65000), new Employee(122,
		 * "LAKSHMI", "JAPAN", 45, 67000), new Employee(124, "VENKAT", "PUNE", 17,
		 * 22000), new Employee(126, "VIKRANT", "NAGAR", 29, 55000), new Employee(131,
		 * "AKSHAY", "PCMC", 32, 48000)).toList().stream().filter(emp->
		 * emp.getEmpSalary()>=50000).forEach(System.out::println);
		 */
		//sortbyname
		/*
		 * Stream.of(new Employee(121, "SWARA", "PUNE", 22, 65000), new Employee(122,
		 * "LAKSHMI", "JAPAN", 45, 67000), new Employee(124, "VENKAT", "PUNE", 17,
		 * 22000), new Employee(126, "VIKRANT", "NAGAR", 29, 55000), new Employee(131,
		 * "AKSHAY", "PCMC", 32,
		 * 48000)).toList().stream().sorted(Comparator.comparing(Employee::getEmpName)).
		 * forEach(System.out::println);
		 */
		
		//sortbyage
		
		/*
		 * Stream.of(new Employee(121, "SWARA", "PUNE", 22, 65000), new Employee(122,
		 * "LAKSHMI", "JAPAN", 45, 67000), new Employee(124, "VENKAT", "PUNE", 17,
		 * 22000), new Employee(126, "VIKRANT", "NAGAR", 29, 55000), new Employee(131,
		 * "AKSHAY", "PCMC", 32,
		 * 48000)).toList().stream().sorted(Comparator.comparingLong(Employee::getEmpAge
		 * )).forEach(System.out::println);
		 */
		
		//sortbysalary
		
		/*
		 * Stream.of(new Employee(121, "SWARA", "PUNE", 22, 98000), new Employee(122,
		 * "LAKSHMI", "JAPAN", 45, 67000), new Employee(124, "VENKAT", "PUNE", 17,
		 * 22000), new Employee(126, "VIKRANT", "NAGAR", 29, 55000), new Employee(131,
		 * "AKSHAY", "PCMC", 32,
		 * 48000)).toList().stream().sorted(Comparator.comparingDouble(Employee::
		 * getEmpSalary).reversed()).forEach(System.out::println);
		 */
		
	long count=	Stream.of(new Employee(121, "SWARA", "PUNE", 22, 98000),
				 new Employee(124, "VENKAT", "PUNE", 17, 22000),
				 new Employee(131, "AKSHAY", "PCMC", 32, 48000)).collect(Collectors.counting());
	
	
	System.out.println(count);
	}

}
