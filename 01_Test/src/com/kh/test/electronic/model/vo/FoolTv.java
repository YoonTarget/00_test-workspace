package com.kh.test.electronic.model.vo;

public class FoolTv extends Tv {
	
	public FoolTv() {}
	
	public FoolTv(boolean trueOrFalse, int reservation, String subtitleTest) {
		super(trueOrFalse, reservation, subtitleTest);
	}

	@Override
	public String toString() {
		return "Fool" + super.toString();
	}
	
	@Override
	public void showText() {
		System.out.print("Fool");
		super.showText();
	}
	
	public void showFoolTv() {
		System.out.println("I'm FoolTv.");
	}

}
