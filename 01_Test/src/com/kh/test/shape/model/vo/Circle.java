package com.kh.test.shape.model.vo;

public class Circle {
	
	public static final double PI = 3.14;
	private double radius;
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("반지름 " + radius + "cm인 원을 그립니다.");
		System.out.printf("원의 둘레는 %.1f cm입니다.", (2 * PI * radius));
	}

}
