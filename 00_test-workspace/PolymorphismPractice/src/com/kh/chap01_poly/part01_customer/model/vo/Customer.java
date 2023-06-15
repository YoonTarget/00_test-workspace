package com.kh.chap01_poly.part01_customer.model.vo;

public class Customer {
	
	private String name;
	private int age;
	private String phoneNum;
	private String address;
	
	public Customer() {}
	
	public Customer(String name, int age, String phoneNum, String address) {
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "name : " + name + ", age : " + age + ", phoneNum : " + phoneNum + ", address : " + address;
	}

}
