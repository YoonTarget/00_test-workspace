package com.kh.test.electronic.model.vo;

public class SmartTv extends Tv {
	
	public SmartTv() {}
	
	public SmartTv(boolean trueOrFalse, int reservation, String subtitleTest) {
		super(trueOrFalse, reservation, subtitleTest);
	}

	@Override
	public String toString() {
		return "Smart" + super.toString();
	}
	
	@Override
	public void showText() {
		System.out.print("Smart");
		super.showText();
	}
	
	public void showSmartTv() {
		System.out.println("I'm SmartTv.");
	}

}
