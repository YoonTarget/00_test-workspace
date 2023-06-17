package com.kh.test.exam.run;

import com.kh.test.exam.model.vo.Exam;

public class Run {

	public static void main(String[] args) {
		
		Exam e = new Exam(100);
		e.print();
		System.out.println(e.getScore());

	}

}
