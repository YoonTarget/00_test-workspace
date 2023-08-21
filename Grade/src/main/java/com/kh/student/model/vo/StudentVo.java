package com.kh.student.model.vo;

public class StudentVo {
	
	// 전역변수
	private int studentNumber;
	private String studentName;
	private int koreanScore;
	private int englishScore;
	private int mathScore;
	
	// 기본생성자
	public StudentVo() {}

	// 전체 매개변수 생성자
	public StudentVo(int studentNumber, String studentName, int koreanScore, int englishScore, int mathScore) {
		super();
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	// getter-setter 메소드
	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getKoreanScore() {
		return koreanScore;
	}

	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	// toString() 메소드
	@Override
	public String toString() {
		return "StudentVo [studentNumber=" + studentNumber + ", studentName=" + studentName + ", koreanScore="
				+ koreanScore + ", englishScore=" + englishScore + ", mathScore=" + mathScore + "]";
	}

}
