package com.csi.core;

import java.util.LinkedList;
import java.util.List;

class Customer {
	private int custId;

	private String custName;

	private String custAddress;

	private double custAccountBalance;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String custName, String custAddress, double custAccountBalance) {

		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custAccountBalance = custAccountBalance;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public double getCustAccountBalance() {
		return custAccountBalance;
	}

	public void setCustAccountBalance(double custAccountBalance) {
		this.custAccountBalance = custAccountBalance;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress
				+ ", custAccountBalance=" + custAccountBalance + "]";
	}

}

public class ForEachConcept {
	public static void main(String[] args) {

		List<Customer> customers = new LinkedList<Customer>();

		customers.add(new Customer(121, "SWARA", "PUNE", 65000.99));
		customers.add(new Customer(122, "LAKSHMI", "JAPAN", 96000.99));
		customers.add(new Customer(123, "VENKAT", "MUMBAI", 45000.99));
		customers.add(new Customer(124, "VIKRANT", "NAGPUR", 50000.00));
		customers.add(new Customer(129, "AKSHAY", "PCMC", 760000.99));
		/*
		 * for (Customer customer : customers) {
		 * 
		 * if (customer.getCustAccountBalance() <= 50000) {
		 * System.out.println(customer); } }
		 */
		
		//customers.stream().filter(cust-> cust.getCustAccountBalance()<=50000.00).forEach(System.out::println);

		customers.forEach(cust-> System.out.println(cust.getCustName()+"\t "+cust.getCustAccountBalance()));
		
		//customers.forEach(System.out::println);
	}
}
