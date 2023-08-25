package org.kh.member.model.vo;

import java.sql.Date;

public class MemberVO {
	
	private int userNo;
	private String userId;
	private String userPw;
	private String userName;
	private String userAddr;
	private Date refDate;
	
	// 기본 생성자
	public MemberVO() {}

	// 전체 매개변수 생성자
	public MemberVO(int userNo, String userId, String userPw, String userName, String userAddr, Date refDate) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userAddr = userAddr;
		this.refDate = refDate;
	}

	// getter-setter 메소드
	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public Date getRefDate() {
		return refDate;
	}

	public void setRefDate(Date refDate) {
		this.refDate = refDate;
	}

	// toSTring() 메소드
	@Override
	public String toString() {
		return "MemberVO [userNo=" + userNo + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName
				+ ", userAddr=" + userAddr + ", refDate=" + refDate + "]";
	}
	
}
