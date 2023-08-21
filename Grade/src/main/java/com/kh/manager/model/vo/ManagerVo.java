package com.kh.manager.model.vo;

public class ManagerVo {
	
	// 전역변수
	private int managerNumber;
	private String managerName;
	private String managerHireDate;
	
	// 기본 생성자
	public ManagerVo() {}

	// 전체 매개변수 생성자
	public ManagerVo(int managerNumber, String managerName, String managerHireDate) {
		super();
		this.managerNumber = managerNumber;
		this.managerName = managerName;
		this.managerHireDate = managerHireDate;
	}

	// getter-setter 메소드
	public int getManagerNumber() {
		return managerNumber;
	}

	public void setManagerNumber(int managerNumber) {
		this.managerNumber = managerNumber;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerHireDate() {
		return managerHireDate;
	}

	public void setManagerHireDate(String managerHireDate) {
		this.managerHireDate = managerHireDate;
	}

	// toString() 메소드
	@Override
	public String toString() {
		return "ManagerVo [managerNumber=" + managerNumber + ", managerName=" + managerName + ", managerHireDate="
				+ managerHireDate + "]";
	}

}
