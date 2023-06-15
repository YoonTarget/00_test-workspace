package com.kh.test.electronic.model.vo;

public class Tv {
	
	private boolean trueOrFalse;
	private int reservation;
	private String subtitleTest;
	
	public Tv() {}

	public Tv(boolean trueOrFalse, int reservation, String subtitleTest) {
		super();
		this.trueOrFalse = trueOrFalse;
		this.reservation = reservation;
		this.subtitleTest = subtitleTest;
	}

	public boolean isTrueOrFalse() {
		return trueOrFalse;
	}

	public void setTrueOrFalse(boolean trueOrFalse) {
		this.trueOrFalse = trueOrFalse;
	}

	public int getReservation() {
		return reservation;
	}

	public void setReservation(int reservation) {
		this.reservation = reservation;
	}

	public String getSubtitleTest() {
		return subtitleTest;
	}

	public void setSubtitleTest(String subtitleTest) {
		this.subtitleTest = subtitleTest;
	}

	@Override
	public String toString() {
		return "Tv [trueOrFalse=" + trueOrFalse + ", reservation=" + reservation + ", subtitleTest=" + subtitleTest
				+ "]";
	}
	
	public void showText() {
		System.out.println("TV 테스트 문구 입니다.");
	}
	
	public void showTv() {
		System.out.println("I'm Tv.");
	}

}
