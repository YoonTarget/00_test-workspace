package com.kh.chap01_poly.part01_customer.model.vo;

public class Normal extends Customer {
	
	private int count;
	
	public Normal() {}
	
	public Normal(String name, int age, String phoneNum, String address, int count) {
		super(name, age, phoneNum, address);
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", count : " + count;
	}

}
