package com.kh.chap01_poly.part01_customer.model.vo;

public class Vip extends Customer {
	
	private String id;
	private String pwd;
	
	public Vip() {}
	
	public Vip(String name, int age, String phoneNum, String address, String id, String pwd) {
		super(name, age, phoneNum, address);
		this.id = id;
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", id : " + id + ", pwd : " + pwd;
	}

}
