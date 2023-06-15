package com.kh.chap01_poly.part01_customer.controller;

import com.kh.chap01_poly.part01_customer.model.vo.Customer;

public class ManageCustomer {
	
	private Customer[] c = new Customer[2];
	private int count = 0;
	
	public ManageCustomer() {}
	
	public ManageCustomer(Customer[] c, int count) {
		this.c = c;
		this.count = count;
	}

	public Customer[] getC() {
		return c;
	}

	public void setC(Customer[] c) {
		this.c = c;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	

}
